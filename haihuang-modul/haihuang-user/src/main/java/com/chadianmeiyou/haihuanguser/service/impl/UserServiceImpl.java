package com.chadianmeiyou.haihuanguser.service.impl;

import com.chadianmeiyou.haihuanguser.dao.UserDao;
import com.chadianmeiyou.haihuanguser.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.bean.HhUser;
import haihuang.enums.MathNumberEnum;
import haihuang.tools.UUID16;
import haihuang.utils.CacheContents;
import haihuang.utils.RedisConfiguration;
import haihuang.utils.serviceUtils.UserUtil;
import haihuang.vo.UserVo;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RedisConfiguration redisConfiguration;
    //--------------------------------------------


    /**
     * 新增用户
     * @param userVo
     */
    @Override
    public void editUser(UserVo userVo) {
        HhUser user = UserUtil.createUserVoToHhUser(userVo);
        if(null != userVo.getId()){
            HhUser user1 = (HhUser) redisConfiguration.vos().get(CacheContents.USERKEY+user.getId().toString());
            if(null != userVo.getIsEditSex()  && null != user1.getIsEditSex()
                    && MathNumberEnum.One.getToString().equals(user1.getIsEditSex().toString())){
                throw new ServiceException("性别只能修改一次！");
            }
            userDao.updateUser(user);
        }else{
            user.setHhid(UUID16.getUUID());
            userDao.addUser(user);
        }
        //添加用户到缓存
        redisConfiguration.vos().set(CacheContents.USERKEY+user.getId().toString(),user);

    }

    @Override
    public UserVo selectUserByLogin(UserVo userVo) {
        HhUser user = UserUtil.createUserVoToHhUser(userVo);
        HhUser userResp = userDao.queryUserByPassWord(user);
        if(null == userResp){
            throw new ServiceException("该用户未注册！");
        }
        UserVo respvo = UserUtil.createHhUserToUserVo(userResp);
        return respvo;
    }

    @Override
    public UserVo selectUserByVo(UserVo userVo) {
        HhUser user = UserUtil.createUserVoToHhUser(userVo);
        HhUser userResp = userDao.selectUserByUser(user);
        UserVo respvo = UserUtil.createHhUserToUserVo(userResp);
        return respvo;
    }

    @Override
    public PageInfo<UserVo> selectUserByPage(UserVo userVo, Page page) {
        HhUser user = UserUtil.createUserVoToHhUser(userVo);
        PageInfo<HhUser> userResp = userDao.selectUserByPage(user,page);
        PageInfo<UserVo> userRespList = UserUtil.createHhUserListToUserVoList(userResp);
        return userRespList;
    }


}
