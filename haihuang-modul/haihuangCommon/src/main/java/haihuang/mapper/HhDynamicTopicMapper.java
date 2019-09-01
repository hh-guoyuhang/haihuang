package haihuang.mapper;

import haihuang.bean.HhDynamicTopic;
import haihuang.bean.HhDynamicTopicExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HhDynamicTopicMapper {
    int countByExample(HhDynamicTopicExample example);

    int deleteByExample(HhDynamicTopicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhDynamicTopic record);

    int insertSelective(HhDynamicTopic record);

    List<HhDynamicTopic> selectByExample(HhDynamicTopicExample example);

    HhDynamicTopic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhDynamicTopic record, @Param("example") HhDynamicTopicExample example);

    int updateByExample(@Param("record") HhDynamicTopic record, @Param("example") HhDynamicTopicExample example);

    int updateByPrimaryKeySelective(HhDynamicTopic record);

    int updateByPrimaryKey(HhDynamicTopic record);
}