package com.chadianmeiyou.haihuanguser.service.impl;

import com.chadianmeiyou.haihuanguser.dao.UserDao;
import com.chadianmeiyou.haihuanguser.service.UserService;
import haihuang.bean.HhUser;
import haihuang.utils.UserUtil;
import haihuang.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
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


}
