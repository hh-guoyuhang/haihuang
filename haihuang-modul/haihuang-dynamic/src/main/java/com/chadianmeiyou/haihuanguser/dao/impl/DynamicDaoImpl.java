package com.chadianmeiyou.haihuanguser.dao.impl;

import com.chadianmeiyou.haihuanguser.dao.DynamicDao;
import com.chadianmeiyou.haihuanguser.mapper.HhDynamicDetailsMapper;
import com.chadianmeiyou.haihuanguser.mapper.HhDynamicMapper;
import haihuang.bean.HhDynamic;
import haihuang.bean.HhDynamicDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DynamicDaoImpl implements DynamicDao {
    @Autowired
    private HhDynamicMapper hhDynamicMapper;
    @Autowired
    private HhDynamicDetailsMapper hhDynamicDetailsMapper;
    @Override
    public void saveDynamic(HhDynamic hhDynamic) {
        hhDynamicMapper.insert(hhDynamic);
    }

    @Override
    public void saveDynamicDetails(HhDynamicDetails hhDynamicDetails) {
        hhDynamicDetailsMapper.insert(hhDynamicDetails);
    }
}
