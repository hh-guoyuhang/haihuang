package haihuang.mapper;

import haihuang.bean.HhDynamicDetails;
import haihuang.bean.HhDynamicDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhDynamicDetailsMapper {
    int countByExample(HhDynamicDetailsExample example);

    int deleteByExample(HhDynamicDetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhDynamicDetails record);

    int insertSelective(HhDynamicDetails record);

    List<HhDynamicDetails> selectByExample(HhDynamicDetailsExample example);

    HhDynamicDetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhDynamicDetails record, @Param("example") HhDynamicDetailsExample example);

    int updateByExample(@Param("record") HhDynamicDetails record, @Param("example") HhDynamicDetailsExample example);

    int updateByPrimaryKeySelective(HhDynamicDetails record);

    int updateByPrimaryKey(HhDynamicDetails record);
}