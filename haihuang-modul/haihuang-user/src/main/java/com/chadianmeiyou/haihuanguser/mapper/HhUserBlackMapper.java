package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhUserBlack;
import haihuang.bean.HhUserBlackExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhUserBlackMapper {
    int countByExample(HhUserBlackExample example);

    int deleteByExample(HhUserBlackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhUserBlack record);

    int insertSelective(HhUserBlack record);

    List<HhUserBlack> selectByExample(HhUserBlackExample example);

    HhUserBlack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhUserBlack record, @Param("example") HhUserBlackExample example);

    int updateByExample(@Param("record") HhUserBlack record, @Param("example") HhUserBlackExample example);

    int updateByPrimaryKeySelective(HhUserBlack record);

    int updateByPrimaryKey(HhUserBlack record);
}