package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhRoomDetails;
import haihuang.bean.HhRoomDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhRoomDetailsMapper {
    int countByExample(HhRoomDetailsExample example);

    int deleteByExample(HhRoomDetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhRoomDetails record);

    int insertSelective(HhRoomDetails record);

    List<HhRoomDetails> selectByExample(HhRoomDetailsExample example);

    HhRoomDetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhRoomDetails record, @Param("example") HhRoomDetailsExample example);

    int updateByExample(@Param("record") HhRoomDetails record, @Param("example") HhRoomDetailsExample example);

    int updateByPrimaryKeySelective(HhRoomDetails record);

    int updateByPrimaryKey(HhRoomDetails record);
}