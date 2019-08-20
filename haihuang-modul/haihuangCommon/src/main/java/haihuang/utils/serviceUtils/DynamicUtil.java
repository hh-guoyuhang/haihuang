package haihuang.utils.serviceUtils;

import com.github.pagehelper.PageInfo;
import haihuang.bean.HhDynamic;
import haihuang.bean.HhUser;
import haihuang.vo.DynamicVo;
import haihuang.vo.UserVo;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicUtil implements Serializable {


    public static HhDynamic createHhDynamic(DynamicVo dynamicVo) {
        HhDynamic hhDynamic = new HhDynamic();
        hhDynamic.setDynamicType(dynamicVo.getDynamicType());
        hhDynamic.setArea(dynamicVo.getArea());
        hhDynamic.setTopic(dynamicVo.getTopic());
        hhDynamic.setUserId(dynamicVo.getUserId());
        hhDynamic.setCreateTime(new Date());
        return hhDynamic;
    }
}
