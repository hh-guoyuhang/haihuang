package haihuang.mapper;

import haihuang.bean.HhDynamicLikeDetails;
import haihuang.bean.HhDynamicLikeDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhDynamicLikeDetailsMapper {
    int countByExample(HhDynamicLikeDetailsExample example);

    int deleteByExample(HhDynamicLikeDetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhDynamicLikeDetails record);

    int insertSelective(HhDynamicLikeDetails record);

    List<HhDynamicLikeDetails> selectByExample(HhDynamicLikeDetailsExample example);

    HhDynamicLikeDetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhDynamicLikeDetails record, @Param("example") HhDynamicLikeDetailsExample example);

    int updateByExample(@Param("record") HhDynamicLikeDetails record, @Param("example") HhDynamicLikeDetailsExample example);

    int updateByPrimaryKeySelective(HhDynamicLikeDetails record);

    int updateByPrimaryKey(HhDynamicLikeDetails record);
}