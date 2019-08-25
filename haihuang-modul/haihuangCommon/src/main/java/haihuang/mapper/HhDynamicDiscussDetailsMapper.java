package haihuang.mapper;

import haihuang.bean.HhDynamicDiscussDetails;
import haihuang.bean.HhDynamicDiscussDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhDynamicDiscussDetailsMapper {
    int countByExample(HhDynamicDiscussDetailsExample example);

    int deleteByExample(HhDynamicDiscussDetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhDynamicDiscussDetails record);

    int insertSelective(HhDynamicDiscussDetails record);

    List<HhDynamicDiscussDetails> selectByExample(HhDynamicDiscussDetailsExample example);

    HhDynamicDiscussDetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhDynamicDiscussDetails record, @Param("example") HhDynamicDiscussDetailsExample example);

    int updateByExample(@Param("record") HhDynamicDiscussDetails record, @Param("example") HhDynamicDiscussDetailsExample example);

    int updateByPrimaryKeySelective(HhDynamicDiscussDetails record);

    int updateByPrimaryKey(HhDynamicDiscussDetails record);
}