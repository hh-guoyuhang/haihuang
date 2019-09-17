package com.chadianmeiyou.haihuanguser.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.bean.HhUser;
import haihuang.utils.RedisConfiguration;
import haihuang.vo.UserRelationVo;
import haihuang.vo.UserVo;


public interface UserService {

    /**
     * 新增用户
     * @param userVo
     * @param redisConfiguration
     * @return
     */
    public HhUser editUser(UserVo userVo, RedisConfiguration redisConfiguration);
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

    /**
     * 新增关注用户
     * @param userRelationVo
     */
    public void addAttention(UserRelationVo userRelationVo);
    /**
     * 新增黑名单用户
     * @param userRelationVo
     */
    public void addBlack(UserRelationVo userRelationVo);

    /**
     * 新增举报黑名单
     * @param userRelationVo
     */
    public void addReport(UserRelationVo userRelationVo);
}
