package com.chadianmeiyou.haihuanguser.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.bean.HhUser;

import java.util.List;

public interface UserDao {
    /**
     * 新增用户
     * @param id
     * @return
     */
    public HhUser queryUserByid(long id);
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

    /**
     * 分页查询用户清单
     * @param user
     * @param pageInfo
     * @return
     */
    public PageInfo<HhUser> selectUserByPage(HhUser user, Page pageInfo);
    /**
     * 分页查询用户清单
     * @return
     */
    public List<HhUser> queryUser();
}
