package com.chadianmeiyou.haihuanguser.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.resp.DynamicResp;
import haihuang.vo.DynamicLikeDiscussVo;
import haihuang.vo.DynamicVo;
import org.springframework.web.multipart.MultipartFile;


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
}
