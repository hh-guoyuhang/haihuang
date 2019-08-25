package haihuang.mapper;

import haihuang.bean.HhDiscussLikeDetails;
import haihuang.bean.HhDiscussLikeDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhDiscussLikeDetailsMapper {
    int countByExample(HhDiscussLikeDetailsExample example);

    int deleteByExample(HhDiscussLikeDetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhDiscussLikeDetails record);

    int insertSelective(HhDiscussLikeDetails record);

    List<HhDiscussLikeDetails> selectByExample(HhDiscussLikeDetailsExample example);

    HhDiscussLikeDetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhDiscussLikeDetails record, @Param("example") HhDiscussLikeDetailsExample example);

    int updateByExample(@Param("record") HhDiscussLikeDetails record, @Param("example") HhDiscussLikeDetailsExample example);

    int updateByPrimaryKeySelective(HhDiscussLikeDetails record);

    int updateByPrimaryKey(HhDiscussLikeDetails record);
}