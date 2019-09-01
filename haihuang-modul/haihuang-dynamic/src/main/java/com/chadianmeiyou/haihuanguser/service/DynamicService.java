package com.chadianmeiyou.haihuanguser.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.resp.DynamicLikeDetailsResp;
import haihuang.resp.DynamicResp;
import haihuang.resp.DynamicTopicResp;
import haihuang.vo.DynamicLikeDiscussVo;
import haihuang.vo.DynamicTopicVo;
import haihuang.vo.DynamicVo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface DynamicService {
    /**
     * 新增动态
     * @param respList
     * @param dynamicVo
     */
    public void saveDynamic(MultipartFile[] respList, DynamicVo dynamicVo) throws Exception;

    /**
     * 推荐查询动态
     * @param dynamicVo
     * @param page
     * @return
     */
    public PageInfo<DynamicResp> getDynamicList(DynamicVo dynamicVo, Page page);

    /**
     * 按条件查询动态
     * @param dynamicVo
     * @param page
     * @return
     */
    public PageInfo<DynamicResp> queryDynamicList(DynamicVo dynamicVo, Page page);

    /**
     * 保存动态点赞详情
     * @param dynamicLikeDiscussVo
     */
    public void saveDynamicLike(DynamicLikeDiscussVo dynamicLikeDiscussVo);
    /**
     * 查询动态点赞详情
     * @param dynamicLikeDiscussVo
     * @return
     */
    public DynamicLikeDetailsResp queryDynamicLike(DynamicLikeDiscussVo dynamicLikeDiscussVo);
    /**
     * 保存动态评论详情
     * @param dynamicLikeDiscussVo
     */
    public void saveDynamicDiscuss(DynamicLikeDiscussVo dynamicLikeDiscussVo);
    /**
     * 查询动态评论详情 一级评论
     * @param dynamicLikeDiscussVo
     * @return
     */
    public DynamicLikeDetailsResp queryDynamicDiscussOne(DynamicLikeDiscussVo dynamicLikeDiscussVo);
    /**
     * 查询动态评论详情 二级评论
     * @param dynamicLikeDiscussVo
     * @return
     */
    public DynamicLikeDetailsResp queryDynamicDiscussTwo(DynamicLikeDiscussVo dynamicLikeDiscussVo);

    /**
     * 保存评论点赞详情
     * @param dynamicLikeDiscussVo
     */
    public void saveDiscussLike(DynamicLikeDiscussVo dynamicLikeDiscussVo);
    /**
     * 查询评论点赞详情
     * @param dynamicLikeDiscussVo
     * @return
     */
    public DynamicLikeDetailsResp queryDiscussLike(DynamicLikeDiscussVo dynamicLikeDiscussVo);

    /**
     * 查询动态
     * @param dynamicTopicVo
     * @return
     */
    public List<DynamicTopicResp> queryDynamicTopic(DynamicTopicVo dynamicTopicVo);

    /**
     * 编辑话题
     * @param dynamicTopicVo
     */
    public void editDynamicTopic(DynamicTopicVo dynamicTopicVo);
}
