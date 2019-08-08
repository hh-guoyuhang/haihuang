package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhUserReport;
import haihuang.bean.HhUserReportExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhUserReportMapper {
    int countByExample(HhUserReportExample example);

    int deleteByExample(HhUserReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhUserReport record);

    int insertSelective(HhUserReport record);

    List<HhUserReport> selectByExample(HhUserReportExample example);

    HhUserReport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhUserReport record, @Param("example") HhUserReportExample example);

    int updateByExample(@Param("record") HhUserReport record, @Param("example") HhUserReportExample example);

    int updateByPrimaryKeySelective(HhUserReport record);

    int updateByPrimaryKey(HhUserReport record);
}