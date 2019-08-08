package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhDynamic;
import haihuang.bean.HhDynamicExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhDynamicMapper {
    int countByExample(HhDynamicExample example);

    int deleteByExample(HhDynamicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhDynamic record);

    int insertSelective(HhDynamic record);

    List<HhDynamic> selectByExample(HhDynamicExample example);

    HhDynamic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhDynamic record, @Param("example") HhDynamicExample example);

    int updateByExample(@Param("record") HhDynamic record, @Param("example") HhDynamicExample example);

    int updateByPrimaryKeySelective(HhDynamic record);

    int updateByPrimaryKey(HhDynamic record);
}