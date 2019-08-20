package com.chadianmeiyou.haihuanguser.service.impl;

import com.chadianmeiyou.haihuanguser.dao.GiftDao;
import com.chadianmeiyou.haihuanguser.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GiftServiceImpl implements GiftService {

    @Autowired
    private GiftDao giftDao;



}
