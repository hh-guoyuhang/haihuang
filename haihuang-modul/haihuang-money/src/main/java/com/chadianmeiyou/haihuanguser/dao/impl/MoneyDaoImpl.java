package com.chadianmeiyou.haihuanguser.dao.impl;

import com.chadianmeiyou.haihuanguser.dao.MoneyDao;
import haihuang.mapper.HhMoneyDetailsMapper;
import haihuang.mapper.HhMoneyMapper;
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
