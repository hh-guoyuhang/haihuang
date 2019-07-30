package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhGiftDetail;
import haihuang.bean.HhGiftDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HhGiftDetailMapper {
    int countByExample(HhGiftDetailExample example);

    int deleteByExample(HhGiftDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhGiftDetail record);

    int insertSelective(HhGiftDetail record);

    List<HhGiftDetail> selectByExample(HhGiftDetailExample example);

    HhGiftDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhGiftDetail record, @Param("example") HhGiftDetailExample example);

    int updateByExample(@Param("record") HhGiftDetail record, @Param("example") HhGiftDetailExample example);

    int updateByPrimaryKeySelective(HhGiftDetail record);

    int updateByPrimaryKey(HhGiftDetail record);
}