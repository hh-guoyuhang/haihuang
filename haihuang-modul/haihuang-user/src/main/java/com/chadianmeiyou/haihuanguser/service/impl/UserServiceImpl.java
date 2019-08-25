package com.chadianmeiyou.haihuanguser.service.impl;

import com.chadianmeiyou.haihuanguser.dao.UserDao;
import com.chadianmeiyou.haihuanguser.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.bean.HhUser;
import haihuang.utils.CacheContents;
import haihuang.utils.RedisConfiguration;
import haihuang.utils.serviceUtils.UserUtil;
import haihuang.vo.UserVo;
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
            HhUser hhUser =  userDao.updateUser(user);
        }else{
            HhUser hhUser = userDao.addUser(user);
        }
        //添加用户到缓存
        redisConfiguration.vos().set(CacheContents.USERKEY+user.getId().toString(),user);

    }

    @Override
    public UserVo selectUserByLogin(UserVo userVo) {
        HhUser user = UserUtil.createUserVoToHhUser(userVo);
        HhUser userResp = userDao.queryUserByPassWord(user);
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
