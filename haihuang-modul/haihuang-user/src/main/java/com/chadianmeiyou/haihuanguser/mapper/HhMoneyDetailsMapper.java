package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhMoneyDetails;
import haihuang.bean.HhMoneyDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhMoneyDetailsMapper {
    int countByExample(HhMoneyDetailsExample example);

    int deleteByExample(HhMoneyDetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhMoneyDetails record);

    int insertSelective(HhMoneyDetails record);

    List<HhMoneyDetails> selectByExample(HhMoneyDetailsExample example);

    HhMoneyDetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhMoneyDetails record, @Param("example") HhMoneyDetailsExample example);

    int updateByExample(@Param("record") HhMoneyDetails record, @Param("example") HhMoneyDetailsExample example);

    int updateByPrimaryKeySelective(HhMoneyDetails record);

    int updateByPrimaryKey(HhMoneyDetails record);
}