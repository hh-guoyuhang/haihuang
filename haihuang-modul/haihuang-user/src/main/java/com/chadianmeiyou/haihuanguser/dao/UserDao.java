package com.chadianmeiyou.haihuanguser.dao;

import haihuang.bean.HhUser;

public interface UserDao {
    /**
     * 新增用户
     * @param user
     * @return
     */
    public HhUser addUser(HhUser user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    public HhUser updateUser(HhUser user);
    /**
     * 登录
     * @param user
     * @return
     */
    public HhUser queryUserByPassWord(HhUser user);
    /**
     * 查询用户表
     * @param user
     * @return
     */
    public HhUser selectUserByUser(HhUser user);
}
