package com.chadianmeiyou.haihuanguser.service.impl;

import com.chadianmeiyou.haihuanguser.dao.UserDao;
import com.chadianmeiyou.haihuanguser.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.bean.HhUser;
import haihuang.bean.HhUserAttention;
import haihuang.bean.HhUserBlack;
import haihuang.bean.HhUserReport;
import haihuang.enums.MathNumberEnum;
import haihuang.tools.UUID16;
import haihuang.utils.CacheContents;
import haihuang.utils.RedisConfiguration;
import haihuang.utils.serviceUtils.UserUtil;
import haihuang.vo.UserRelationVo;
import haihuang.vo.UserVo;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    //--------------------------------------------


    /**
     * 新增用户
     * @param userVo
     * @param redisConfiguration
     * @return
     */
    @Override
    public HhUser editUser(UserVo userVo, RedisConfiguration redisConfiguration) {
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
            user.setCreateTime(new Date());
            userDao.addUser(user);
        }
        //添加用户到缓存
        redisConfiguration.vos().set(CacheContents.USERKEY+user.getId().toString(),user);
        return user;
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

    @Override
    public void addAttention(UserRelationVo userRelationVo) {
        HhUserAttention hhUserAttention = UserUtil.createHhUserAttentionByVo(userRelationVo);
        hhUserAttention.setCreateTime(new Date());
        userDao.addAttention(hhUserAttention);
    }

    @Override
    public void addBlack(UserRelationVo userRelationVo) {
        HhUserBlack hhUserBlack = UserUtil.createHhUserBlackByVo(userRelationVo);
        hhUserBlack.setCreateTime(new Date());
        userDao.addBlack(hhUserBlack);
    }

    @Override
    public void addReport(UserRelationVo userRelationVo) {
        HhUserReport hhUserBlack = UserUtil.createHhUserReportByVo(userRelationVo);
        hhUserBlack.setCreateTime(new Date());
        userDao.addReport(hhUserBlack);
    }
}
