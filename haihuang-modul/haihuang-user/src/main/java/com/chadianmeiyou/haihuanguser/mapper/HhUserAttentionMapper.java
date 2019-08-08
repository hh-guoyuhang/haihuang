package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhUserAttention;
import haihuang.bean.HhUserAttentionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhUserAttentionMapper {
    int countByExample(HhUserAttentionExample example);

    int deleteByExample(HhUserAttentionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhUserAttention record);

    int insertSelective(HhUserAttention record);

    List<HhUserAttention> selectByExample(HhUserAttentionExample example);

    HhUserAttention selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhUserAttention record, @Param("example") HhUserAttentionExample example);

    int updateByExample(@Param("record") HhUserAttention record, @Param("example") HhUserAttentionExample example);

    int updateByPrimaryKeySelective(HhUserAttention record);

    int updateByPrimaryKey(HhUserAttention record);
}