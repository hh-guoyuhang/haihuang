package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhMoney;
import haihuang.bean.HhMoneyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhMoneyMapper {
    int countByExample(HhMoneyExample example);

    int deleteByExample(HhMoneyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhMoney record);

    int insertSelective(HhMoney record);

    List<HhMoney> selectByExample(HhMoneyExample example);

    HhMoney selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhMoney record, @Param("example") HhMoneyExample example);

    int updateByExample(@Param("record") HhMoney record, @Param("example") HhMoneyExample example);

    int updateByPrimaryKeySelective(HhMoney record);

    int updateByPrimaryKey(HhMoney record);
}