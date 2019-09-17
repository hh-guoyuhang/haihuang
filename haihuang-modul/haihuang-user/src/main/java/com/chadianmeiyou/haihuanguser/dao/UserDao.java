package com.chadianmeiyou.haihuanguser.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.bean.HhUser;
import haihuang.bean.HhUserAttention;
import haihuang.bean.HhUserBlack;
import haihuang.bean.HhUserReport;

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

    /**
     * 保存用户关注信息
     * @param hhUserAttention
     */
    public void addAttention(HhUserAttention hhUserAttention);
    /**
     * 保存黑名单信息
     * @param hhUserBlack
     */
    public void addBlack(HhUserBlack hhUserBlack);
    /**
     * 新增举报黑名单
     * @param hhUserBlack
     */
    public void addReport(HhUserReport hhUserReport);
}
