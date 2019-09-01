package com.chadianmeiyou.haihuanguser.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.bean.*;
import haihuang.resp.DynamicResp;
import haihuang.vo.DynamicVo;

import java.util.List;

public interface DynamicDao {
    /**
     * 新增动态表
     * @param hhDynamic
     * @return
     */
    public void saveDynamic(HhDynamic hhDynamic);
    /**
     * 新增动态清单表
     * @param hhDynamicDetails
     * @return
     */
    public void saveDynamicDetails(HhDynamicDetails hhDynamicDetails);

    public PageInfo<DynamicResp> selectDynamicByPage(DynamicVo dynamicVo, Page page);

    public void saveDynamicLike(HhDynamicLikeDetails dynamicLikeDiscussVo);

    public void saveDynamicDiscuss(HhDynamicDiscussDetails dynamicDiscussDetails);

    public void saveDiscussLike(HhDiscussLikeDetails dynamicDiscussDetails);

    public List<HhDynamicLikeDetails> queryDynamicLike(HhDynamicLikeDetails dynamicLikeDiscussVo);

    public List<HhDynamicDiscussDetails> queryDynamicDiscussOne(HhDynamicDiscussDetails dynamicDiscussDetails);

    public List<HhDynamicDiscussDetails> queryDynamicDiscussTwo(HhDynamicDiscussDetails dynamicDiscussDetails);

    public List<HhDiscussLikeDetails> queryDiscussLike(HhDiscussLikeDetails dynamicDiscussDetails);

    public List<HhDynamicTopic> queryDynamicTopic(HhDynamicTopic hhDynamicTopic);

    public void saveeDynamicTopic(HhDynamicTopic hhDynamicTopic);

    public void updateDynamicTopic(HhDynamicTopic hhDynamicTopic);

    public void insertDynamicTopic(HhDynamicTopic hhDynamicTopic);
}
