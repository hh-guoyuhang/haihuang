package com.chadianmeiyou.haihuanguser.dao.impl;

import com.chadianmeiyou.haihuanguser.dao.RoomDao;
import haihuang.mapper.HhRoomDetailsMapper;
import haihuang.mapper.HhRoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class RoomDaoImpl implements RoomDao {
    @Autowired
    private HhRoomMapper hhRoomMapper;
    @Autowired
    private HhRoomDetailsMapper hhRoomDetailsMapper;

}
