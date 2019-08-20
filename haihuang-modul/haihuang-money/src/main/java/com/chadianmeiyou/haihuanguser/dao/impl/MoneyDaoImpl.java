package com.chadianmeiyou.haihuanguser.dao.impl;

import com.chadianmeiyou.haihuanguser.dao.MoneyDao;
import com.chadianmeiyou.haihuanguser.mapper.HhMoneyDetailsMapper;
import com.chadianmeiyou.haihuanguser.mapper.HhMoneyMapper;
import haihuang.bean.HhDynamic;
import haihuang.bean.HhDynamicDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class MoneyDaoImpl implements MoneyDao {
    @Autowired
    private HhMoneyMapper hhMoneyMapper;
    @Autowired
    private HhMoneyDetailsMapper hhMoneyDetailsMapper;

}
