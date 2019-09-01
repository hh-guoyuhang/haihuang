package com.chadianmeiyou.haihuanguser.dao.impl;

import com.chadianmeiyou.haihuanguser.dao.DynamicDao;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import haihuang.bean.*;
import haihuang.mapper.*;
import haihuang.resp.DynamicResp;
import haihuang.vo.DynamicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Component
public class DynamicDaoImpl implements DynamicDao {
    @Autowired
    private HhDynamicMapper hhDynamicMapper;
    @Autowired
    private HhDynamicDetailsMapper hhDynamicDetailsMapper;
    @Autowired
    private ExtDynamicMapper extDynamicMapper;
    @Autowired
    private HhDynamicLikeDetailsMapper hhDynamicLikeDetailsMapper;
    @Autowired
    private HhDynamicDiscussDetailsMapper hhDynamicDiscussDetailsMapper;
    @Autowired
    private HhDiscussLikeDetailsMapper hhDiscussLikeDetailsMapper;
    @Autowired
    private HhDynamicTopicMapper hhDynamicTopicMapper;
    @Override
    public void saveDynamic(HhDynamic hhDynamic) {
        hhDynamicMapper.insert(hhDynamic);
    }

    @Override
    public void saveDynamicDetails(HhDynamicDetails hhDynamicDetails) {
        hhDynamicDetailsMapper.insert(hhDynamicDetails);
    }

    @Override
    public PageInfo<DynamicResp> selectDynamicByPage(DynamicVo dynamicVo, Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<DynamicResp> dynamic = extDynamicMapper.selectDynamicByPage(dynamicVo);
        PageInfo<DynamicResp> pageInfo = new PageInfo<DynamicResp>(dynamic);
        return pageInfo;
    }

    @Override
    public void saveDynamicLike(HhDynamicLikeDetails hhDynamicLikeDetails) {
        hhDynamicLikeDetailsMapper.insert(hhDynamicLikeDetails);
    }

    @Override
    public void saveDynamicDiscuss(HhDynamicDiscussDetails hhDynamicDiscussDetails) {
        hhDynamicDiscussDetailsMapper.insert(hhDynamicDiscussDetails);
    }

    @Override
    public void saveDiscussLike(HhDiscussLikeDetails hhDiscussLikeDetails) {
        hhDiscussLikeDetailsMapper.insert(hhDiscussLikeDetails);
    }

    @Override
    public List<HhDynamicLikeDetails> queryDynamicLike(HhDynamicLikeDetails dynamicLikeDiscussVo) {
        HhDynamicLikeDetailsExample example = new HhDynamicLikeDetailsExample();
        HhDynamicLikeDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andDynamicIdEqualTo(dynamicLikeDiscussVo.getDynamicId());
        return hhDynamicLikeDetailsMapper.selectByExample(example);
    }

    @Override
    public List<HhDynamicDiscussDetails> queryDynamicDiscussOne(HhDynamicDiscussDetails dynamicDiscussDetails) {
        HhDynamicDiscussDetailsExample example = new HhDynamicDiscussDetailsExample();
        HhDynamicDiscussDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andDynamicIdEqualTo(dynamicDiscussDetails.getDynamicId());
        criteria.andUserIdEqualTo(dynamicDiscussDetails.getUserId());
        criteria.andParentIdIsNull();
        return hhDynamicDiscussDetailsMapper.selectByExample(example);
    }

    @Override
    public List<HhDynamicDiscussDetails> queryDynamicDiscussTwo(HhDynamicDiscussDetails dynamicDiscussDetails) {
        HhDynamicDiscussDetailsExample example = new HhDynamicDiscussDetailsExample();
        HhDynamicDiscussDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andDynamicIdEqualTo(dynamicDiscussDetails.getDynamicId());
        criteria.andUserIdEqualTo(dynamicDiscussDetails.getUserId());
        criteria.andParentIdEqualTo(dynamicDiscussDetails.getParentId());
        return hhDynamicDiscussDetailsMapper.selectByExample(example);
    }

    @Override
    public List<HhDiscussLikeDetails> queryDiscussLike(HhDiscussLikeDetails dynamicDiscussDetails) {
        HhDiscussLikeDetailsExample example = new HhDiscussLikeDetailsExample();
        HhDiscussLikeDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andDiscussIdEqualTo(dynamicDiscussDetails.getDiscussId());
        criteria.andUserIdEqualTo(dynamicDiscussDetails.getUserId());
        return hhDiscussLikeDetailsMapper.selectByExample(example);
    }

    @Override
    public List<HhDynamicTopic> queryDynamicTopic(HhDynamicTopic hhDynamicTopic) {
        HhDynamicTopicExample example = new HhDynamicTopicExample();
        HhDynamicTopicExample.Criteria criteria = example.createCriteria();
        criteria.andTopicLike(hhDynamicTopic.getTopic());
        example.setOrderByClause("count desc");
        return hhDynamicTopicMapper.selectByExample(example);
    }

    @Override
    public void saveeDynamicTopic(HhDynamicTopic hhDynamicTopic) {
        hhDynamicTopic.setCreatime(new Date());
        hhDynamicTopicMapper.insert(hhDynamicTopic);
    }

    @Override
    public void updateDynamicTopic(HhDynamicTopic hhDynamicTopic) {
        hhDynamicTopicMapper.updateByPrimaryKeySelective(hhDynamicTopic);
    }

    @Override
    public void insertDynamicTopic(HhDynamicTopic hhDynamicTopic) {
        HhDynamicTopicExample example = new HhDynamicTopicExample();
        HhDynamicTopicExample.Criteria criteria = example.createCriteria();
        criteria.andTopicEqualTo(hhDynamicTopic.getTopic());
        example.setOrderByClause("count desc");
        List<HhDynamicTopic> hhDynamicTopics = hhDynamicTopicMapper.selectByExample(example);
        if(null != hhDynamicTopics && !hhDynamicTopics.isEmpty()){
            saveeDynamicTopic(hhDynamicTopic);
        }else{
            HhDynamicTopic hhDynamicTopic1 = hhDynamicTopics.get(0);
            hhDynamicTopic1.setCount(hhDynamicTopic1.getCount()+1);
            updateDynamicTopic(hhDynamicTopic1);
        }
    }
}
