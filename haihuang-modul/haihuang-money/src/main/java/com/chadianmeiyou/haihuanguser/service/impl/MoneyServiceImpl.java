package com.chadianmeiyou.haihuanguser.service.impl;

import com.chadianmeiyou.haihuanguser.dao.MoneyDao;
import com.chadianmeiyou.haihuanguser.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private MoneyDao moneyDao;




}
