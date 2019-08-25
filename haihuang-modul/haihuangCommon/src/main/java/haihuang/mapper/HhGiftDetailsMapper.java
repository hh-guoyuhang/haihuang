package haihuang.mapper;

import haihuang.bean.HhGiftDetails;
import haihuang.bean.HhGiftDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HhGiftDetailsMapper {
    int countByExample(HhGiftDetailsExample example);

    int deleteByExample(HhGiftDetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhGiftDetails record);

    int insertSelective(HhGiftDetails record);

    List<HhGiftDetails> selectByExample(HhGiftDetailsExample example);

    HhGiftDetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhGiftDetails record, @Param("example") HhGiftDetailsExample example);

    int updateByExample(@Param("record") HhGiftDetails record, @Param("example") HhGiftDetailsExample example);

    int updateByPrimaryKeySelective(HhGiftDetails record);

    int updateByPrimaryKey(HhGiftDetails record);
}