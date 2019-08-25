package haihuang.mapper;

import haihuang.bean.HhDynamicDetails;
import haihuang.bean.HhDynamicDetailsExample;
import haihuang.resp.DynamicResp;
import haihuang.vo.DynamicVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExtDynamicMapper {

    public List<DynamicResp> selectDynamicByPage(DynamicVo dynamicVo);

}