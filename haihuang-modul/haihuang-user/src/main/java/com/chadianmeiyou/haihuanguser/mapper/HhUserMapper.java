package com.chadianmeiyou.haihuanguser.mapper;

import haihuang.bean.HhUser;
import haihuang.bean.HhUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HhUserMapper {
    int countByExample(HhUserExample example);

    int deleteByExample(HhUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhUser record);

    int insertSelective(HhUser record);

    List<HhUser> selectByExample(HhUserExample example);

    HhUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhUser record, @Param("example") HhUserExample example);

    int updateByExample(@Param("record") HhUser record, @Param("example") HhUserExample example);

    int updateByPrimaryKeySelective(HhUser record);

    int updateByPrimaryKey(HhUser record);
}