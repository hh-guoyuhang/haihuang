package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhGiftStatistics;
import haihuang.bean.HhGiftStatisticsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HhGiftStatisticsMapper {
    int countByExample(HhGiftStatisticsExample example);

    int deleteByExample(HhGiftStatisticsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhGiftStatistics record);

    int insertSelective(HhGiftStatistics record);

    List<HhGiftStatistics> selectByExample(HhGiftStatisticsExample example);

    HhGiftStatistics selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhGiftStatistics record, @Param("example") HhGiftStatisticsExample example);

    int updateByExample(@Param("record") HhGiftStatistics record, @Param("example") HhGiftStatisticsExample example);

    int updateByPrimaryKeySelective(HhGiftStatistics record);

    int updateByPrimaryKey(HhGiftStatistics record);
}