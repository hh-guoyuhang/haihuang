package haihuang.mapper;

import haihuang.bean.HhRoom;
import haihuang.bean.HhRoomExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HhRoomMapper {
    int countByExample(HhRoomExample example);

    int deleteByExample(HhRoomExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HhRoom record);

    int insertSelective(HhRoom record);

    List<HhRoom> selectByExample(HhRoomExample example);

    HhRoom selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HhRoom record, @Param("example") HhRoomExample example);

    int updateByExample(@Param("record") HhRoom record, @Param("example") HhRoomExample example);

    int updateByPrimaryKeySelective(HhRoom record);

    int updateByPrimaryKey(HhRoom record);
}