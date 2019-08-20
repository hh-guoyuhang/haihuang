package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhDictionaries;
import haihuang.bean.HhDictionariesExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhDictionariesMapper {
    int countByExample(HhDictionariesExample example);

    int deleteByExample(HhDictionariesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhDictionaries record);

    int insertSelective(HhDictionaries record);

    List<HhDictionaries> selectByExample(HhDictionariesExample example);

    HhDictionaries selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhDictionaries record, @Param("example") HhDictionariesExample example);

    int updateByExample(@Param("record") HhDictionaries record, @Param("example") HhDictionariesExample example);

    int updateByPrimaryKeySelective(HhDictionaries record);

    int updateByPrimaryKey(HhDictionaries record);
}