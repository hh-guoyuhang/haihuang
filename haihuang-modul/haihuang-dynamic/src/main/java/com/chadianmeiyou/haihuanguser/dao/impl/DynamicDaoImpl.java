package com.chadianmeiyou.haihuanguser.dao.impl;

import com.chadianmeiyou.haihuanguser.dao.DynamicDao;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import haihuang.bean.HhDynamicLikeDetails;
import haihuang.mapper.ExtDynamicMapper;
import haihuang.mapper.HhDynamicDetailsMapper;
import haihuang.mapper.HhDynamicLikeDetailsMapper;
import haihuang.mapper.HhDynamicMapper;
import haihuang.bean.HhDynamic;
import haihuang.bean.HhDynamicDetails;
import haihuang.resp.DynamicResp;
import haihuang.vo.DynamicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
    public void saveDynamicLike(HhDynamicLikeDetails dynamicLikeDetails) {
        hhDynamicLikeDetailsMapper.insert(dynamicLikeDetails);
    }
}
