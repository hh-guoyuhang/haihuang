package com.chadianmeiyou.haihuanguser.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.vo.UserVo;


public interface UserService {

    /**
     * 新增用户
     * @param userVo
     */
    public void editUser(UserVo userVo);
    /**
     * 登录
     * @param userVo
     */
    public UserVo selectUserByLogin(UserVo userVo);
    /**
     * 通过vo查user
     * @param userVo
     */
    public UserVo selectUserByVo(UserVo userVo);

    /**
     * 分页查询用户信息
     * @param userVo
     * @param page
     * @return
     */
    public PageInfo<UserVo> selectUserByPage(UserVo userVo, Page page);
}
