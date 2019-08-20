package com.chadianmeiyou.haihuanguser.service.impl;

import com.chadianmeiyou.haihuanguser.dao.RoomDao;
import com.chadianmeiyou.haihuanguser.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDao roomDao;



}
