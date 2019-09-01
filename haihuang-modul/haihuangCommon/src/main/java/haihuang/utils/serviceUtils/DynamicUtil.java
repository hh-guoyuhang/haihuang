package haihuang.utils.serviceUtils;

import com.github.pagehelper.PageInfo;
import haihuang.bean.*;
import haihuang.resp.DynamicTopicResp;
import haihuang.vo.DynamicLikeDiscussVo;
import haihuang.vo.DynamicTopicVo;
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

    public static HhDynamicDiscussDetails createHhDynamicDiscuss(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        if(null == dynamicLikeDiscussVo){
            return null;
        }
        HhDynamicDiscussDetails dynamicLikeDetails = new HhDynamicDiscussDetails();
        dynamicLikeDetails.setDynamicId(dynamicLikeDiscussVo.getDynamicId());
        dynamicLikeDetails.setDiscuss(dynamicLikeDiscussVo.getDiscuss());
        dynamicLikeDetails.setParentId(dynamicLikeDiscussVo.getParentId());
        dynamicLikeDetails.setUserId(dynamicLikeDiscussVo.getUserId());
        dynamicLikeDetails.setCreateTime(new Date());
        return dynamicLikeDetails;
    }

    public static HhDiscussLikeDetails createHhDiscussLike(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        if(null == dynamicLikeDiscussVo){
            return null;
        }
        HhDiscussLikeDetails discussLikeDetails = new HhDiscussLikeDetails();
        discussLikeDetails.setUserId(dynamicLikeDiscussVo.getUserId());
        discussLikeDetails.setDiscussId(dynamicLikeDiscussVo.getDiscussId());
        discussLikeDetails.setCreateTime(new Date());
        return discussLikeDetails;
    }

    public static HhDynamicTopic createDynamicTopicByVo(DynamicTopicVo dynamicTopicVo) {
        if(null == dynamicTopicVo){
            return null;
        }
        HhDynamicTopic hhDynamicTopic = new HhDynamicTopic();
        BeanUtils.copyProperties(dynamicTopicVo,hhDynamicTopic);
        return hhDynamicTopic;
    }

    public static List<DynamicTopicResp> createDynamicTopicRespByEntityList(List<HhDynamicTopic> hhDynamicTopics) {
        if(null == hhDynamicTopics){
            return null;
        }
        List<DynamicTopicResp> dynamicTopicResps = new ArrayList<DynamicTopicResp>();
        for (HhDynamicTopic hhDynamicTopic: hhDynamicTopics) {
            DynamicTopicResp dynamicTopicResp = createDynamicTopicRespByEntity(hhDynamicTopic);
            dynamicTopicResps.add(dynamicTopicResp);
        }

        return dynamicTopicResps;
    }

    private static DynamicTopicResp createDynamicTopicRespByEntity(HhDynamicTopic hhDynamicTopic) {
        if(null == hhDynamicTopic){
            return null;
        }
        DynamicTopicResp dynamicTopicResp = new DynamicTopicResp();
        BeanUtils.copyProperties(hhDynamicTopic,dynamicTopicResp);
        return dynamicTopicResp;
    }
}
