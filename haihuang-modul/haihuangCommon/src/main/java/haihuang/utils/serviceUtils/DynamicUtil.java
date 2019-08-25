package haihuang.utils.serviceUtils;

import com.github.pagehelper.PageInfo;
import haihuang.bean.HhDynamic;
import haihuang.bean.HhDynamicLikeDetails;
import haihuang.bean.HhUser;
import haihuang.vo.DynamicLikeDiscussVo;
import haihuang.vo.DynamicVo;
import haihuang.vo.UserVo;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicUtil implements Serializable {


    public static HhDynamic createHhDynamic(DynamicVo dynamicVo) {
        if(null == dynamicVo){
            return null;
        }
        HhDynamic hhDynamic = new HhDynamic();
        hhDynamic.setDynamicType(dynamicVo.getDynamicType());
        hhDynamic.setArea(dynamicVo.getArea());
        hhDynamic.setTopic(dynamicVo.getTopic());
        hhDynamic.setUserId(dynamicVo.getUserId());
        hhDynamic.setCreateTime(new Date());
        return hhDynamic;
    }

    public static DynamicVo createHhDynamicToDynamicVo(HhDynamic hhDynamic) {
        if(null == hhDynamic){
            return null;
        }
        DynamicVo dynamicVo = new DynamicVo();
        dynamicVo.setDynamicType(hhDynamic.getDynamicType());
        dynamicVo.setArea(hhDynamic.getArea());
        dynamicVo.setTopic(hhDynamic.getTopic());
        dynamicVo.setUserId(hhDynamic.getUserId());
        dynamicVo.setCreateTime(new Date());
        return dynamicVo;
    }

    public static HhDynamicLikeDetails createHhDynamicLike(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        if(null == dynamicLikeDiscussVo){
            return null;
        }
        HhDynamicLikeDetails dynamicLikeDetails = new HhDynamicLikeDetails();
        dynamicLikeDetails.setDynamicId(dynamicLikeDiscussVo.getDynamicId());
        dynamicLikeDetails.setUserId(dynamicLikeDiscussVo.getUserId());
        dynamicLikeDetails.setCreateTime(new Date());
        return dynamicLikeDetails;
    }
}
