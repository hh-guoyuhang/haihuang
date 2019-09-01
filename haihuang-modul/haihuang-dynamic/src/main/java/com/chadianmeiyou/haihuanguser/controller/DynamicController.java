package com.chadianmeiyou.haihuanguser.controller;


import com.chadianmeiyou.haihuanguser.service.DynamicService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import haihuang.resp.CommenResp;
import haihuang.resp.DynamicLikeDetailsResp;
import haihuang.resp.DynamicResp;
import haihuang.resp.DynamicTopicResp;
import haihuang.utils.RedisConfiguration;
import haihuang.vo.DynamicLikeDiscussVo;
import haihuang.vo.DynamicTopicVo;
import haihuang.vo.DynamicVo;
import org.apache.log4j.Logger;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
@RequestMapping(value = "/dynamic")
public class DynamicController {
    private static Logger logger = Logger.getLogger(DynamicController.class);

    @Autowired
    private DynamicService dynamicService;
    @Autowired
    private RedisConfiguration redisConfiguration;
    @RequestMapping("/index")
    public String index()
    {
        return "index";
    }
    /**
     * 新增动态
     * @return
     */
    @RequestMapping(value = "/getMessageCode",method = RequestMethod.POST,produces = "application/json")
    public CommenResp saveDynamic(@RequestParam("fileName") MultipartFile[] files,DynamicVo dynamicVo){
        CommenResp resp = new CommenResp();
        try{
            dynamicService.saveDynamic(files,dynamicVo);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }

    /**
     * 推荐查询动态
     * @param dynamicVo
     * @param page
     * @return
     */
    @RequestMapping(value = "/getDynamicList",method = RequestMethod.POST,produces = "application/json")
    //@RequestMapping(value = "/queryDynamicList",method = RequestMethod.GET)
    public CommenResp getDynamicList(DynamicVo dynamicVo,Page page){
        CommenResp<PageInfo<DynamicResp>> resp = new CommenResp<PageInfo<DynamicResp>>();
        try{
            page.setPageNum(1);
            page.setPageSize(20);
            PageInfo<DynamicResp> dynamicList = dynamicService.getDynamicList(dynamicVo,page);
            resp.setBody(dynamicList);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }
    /**
     * 按条件查询动态
     * @param dynamicVo
     * @param page
     * @return
     */
    @RequestMapping(value = "/queryDynamicList",method = RequestMethod.POST,produces = "application/json")
    //@RequestMapping(value = "/queryDynamicList",method = RequestMethod.GET)
    public CommenResp queryDynamicList(DynamicVo dynamicVo,Page page){
        CommenResp<PageInfo<DynamicResp>> resp = new CommenResp<PageInfo<DynamicResp>>();
        try{
            page.setPageNum(1);
            page.setPageSize(20);
            PageInfo<DynamicResp> dynamicList = dynamicService.queryDynamicList(dynamicVo,page);
            resp.setBody(dynamicList);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }

    /**
     * 保存动态点赞详情
     * @param dynamicLikeDiscussVo
     * @return
     */
    @RequestMapping(value = "/saveDynamicLike",method = RequestMethod.POST,produces = "application/json")
    public CommenResp saveDynamicLike(DynamicLikeDiscussVo dynamicLikeDiscussVo){
        CommenResp resp = new CommenResp();
        try{
            //HhUser user = (HhUser) redisConfiguration.vos().get(CacheContents.USERKEY + dynamicLikeDiscussVo.getUserId());
            dynamicService.saveDynamicLike(dynamicLikeDiscussVo);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }
    /**
     * 查询动态点赞详情
     * @param dynamicLikeDiscussVo
     * @return
     */
    @RequestMapping(value = "/queryDynamicLike",method = RequestMethod.POST,produces = "application/json")
    public CommenResp queryDynamicLike(DynamicLikeDiscussVo dynamicLikeDiscussVo){
        CommenResp<DynamicLikeDetailsResp> resp = new CommenResp<DynamicLikeDetailsResp>();
        try{
            if(0 == dynamicLikeDiscussVo.getDynamicId()){
                throw  new ServiceException("动态id为必输项！");
            }
            DynamicLikeDetailsResp dynamicLikeDetailsResp = dynamicService.queryDynamicLike(dynamicLikeDiscussVo);
            resp.setBody(dynamicLikeDetailsResp);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }


    /**
     * 保存动态评论详情
     * @param dynamicLikeDiscussVo
     * @return
     */
    @RequestMapping(value = "/saveDynamicDiscuss",method = RequestMethod.POST,produces = "application/json")
    public CommenResp saveDynamicDiscuss(DynamicLikeDiscussVo dynamicLikeDiscussVo){
        CommenResp resp = new CommenResp();
        try{
            dynamicService.saveDynamicDiscuss(dynamicLikeDiscussVo);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }

    /**
     * 查询动态评论详情  一级评论
     * @param dynamicLikeDiscussVo
     * @return
     */
    @RequestMapping(value = "/queryDynamicDiscussOne",method = RequestMethod.POST,produces = "application/json")
    public CommenResp queryDynamicDiscussOne(DynamicLikeDiscussVo dynamicLikeDiscussVo){
        CommenResp resp = new CommenResp();
        try{
            if(0 == dynamicLikeDiscussVo.getDynamicId()){
                throw  new ServiceException("动态id为必输项！");
            }
            if(0 == dynamicLikeDiscussVo.getUserId()){
                throw  new ServiceException("用户id为必输项！");
            }
            dynamicService.queryDynamicDiscussOne(dynamicLikeDiscussVo);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }
    /**
     * 查询动态评论详情  二级评论
     * @param dynamicLikeDiscussVo
     * @return
     */
    @RequestMapping(value = "/queryDynamicDiscussTwo",method = RequestMethod.POST,produces = "application/json")
    public CommenResp queryDynamicDiscussTwo(DynamicLikeDiscussVo dynamicLikeDiscussVo){
        CommenResp<DynamicLikeDetailsResp> resp = new CommenResp<DynamicLikeDetailsResp>();
        try{
            if(0 == dynamicLikeDiscussVo.getDynamicId()){
                throw  new ServiceException("动态id为必输项！");
            }
            if(0 == dynamicLikeDiscussVo.getUserId()){
                throw  new ServiceException("用户id为必输项！");
            }
            if(0 == dynamicLikeDiscussVo.getParentId()){
                throw  new ServiceException("评论父id为必输项！");
            }
            DynamicLikeDetailsResp dynamicLikeDetailsResp = dynamicService.queryDynamicDiscussTwo(dynamicLikeDiscussVo);
            resp.setBody(dynamicLikeDetailsResp);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }


    /**
     * 保存评论点赞详情
     * @param dynamicLikeDiscussVo
     * @return
     */
    @RequestMapping(value = "/saveDiscussLike",method = RequestMethod.POST,produces = "application/json")
    public CommenResp saveDiscussLike(DynamicLikeDiscussVo dynamicLikeDiscussVo){
        CommenResp resp = new CommenResp();
        try{
            dynamicService.saveDiscussLike(dynamicLikeDiscussVo);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }
    /**
     * 查询评论点赞详情
     * @param dynamicLikeDiscussVo
     * @return
     */
    @RequestMapping(value = "/queryDiscussLike",method = RequestMethod.POST,produces = "application/json")
    public CommenResp queryDiscussLike(DynamicLikeDiscussVo dynamicLikeDiscussVo){
        CommenResp<DynamicLikeDetailsResp> resp = new CommenResp<DynamicLikeDetailsResp>();
        try{
            if(0 == dynamicLikeDiscussVo.getDiscussId()){
                throw  new ServiceException("动态id为必输项！");
            }
            if(0 == dynamicLikeDiscussVo.getUserId()){
                throw  new ServiceException("用户id为必输项！");
            }
            DynamicLikeDetailsResp dynamicLikeDetailsResp = dynamicService.queryDiscussLike(dynamicLikeDiscussVo);
            resp.setBody(dynamicLikeDetailsResp);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }

    /**
     * 查询话题
     * @param dynamicTopicVo
     * @return
     */
    @RequestMapping(value = "/queryDynamicTopic",method = RequestMethod.POST,produces = "application/json")
    public CommenResp queryDynamicTopic(DynamicTopicVo dynamicTopicVo){
        CommenResp<List<DynamicTopicResp>> resp = new CommenResp<List<DynamicTopicResp>>();
        try{
            if(StringUtil.isEmpty(dynamicTopicVo.getTopic())){
                throw  new ServiceException("请输入话题！");
            }
            List<DynamicTopicResp> dynamicTopicResp = dynamicService.queryDynamicTopic(dynamicTopicVo);
            resp.setBody(dynamicTopicResp);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }

    /**
     * 保存/编辑话题
     * @param dynamicTopicVo
     * @return
     */
    @RequestMapping(value = "/saveDynamicTopic",method = RequestMethod.POST,produces = "application/json")
    public CommenResp saveDynamicTopic(DynamicTopicVo dynamicTopicVo){
        CommenResp resp = new CommenResp();
        try{
            if(StringUtil.isEmpty(dynamicTopicVo.getTopic())){
                throw  new ServiceException("请输入话题！");
            }
            if(0 == dynamicTopicVo.getCount()){
                throw  new ServiceException("请输入话题！");
            }
            dynamicService.editDynamicTopic(dynamicTopicVo);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg("网络异常");
        }
        return resp;
    }

}
