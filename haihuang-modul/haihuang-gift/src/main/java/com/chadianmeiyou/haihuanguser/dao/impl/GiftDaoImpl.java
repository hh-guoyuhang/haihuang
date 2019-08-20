package com.chadianmeiyou.haihuanguser.dao.impl;

import com.chadianmeiyou.haihuanguser.dao.GiftDao;
import com.chadianmeiyou.haihuanguser.mapper.HhGiftDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class GiftDaoImpl implements GiftDao {

    @Autowired
    private HhGiftDetailsMapper hhGiftDetailsMapper;
}
