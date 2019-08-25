package com.chadianmeiyou.haihuanguser.controller;


import com.chadianmeiyou.haihuanguser.service.DynamicService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.bean.HhUser;
import haihuang.resp.CommenResp;
import haihuang.resp.DynamicResp;
import haihuang.utils.CacheContents;
import haihuang.utils.RedisConfiguration;
import haihuang.vo.DynamicLikeDiscussVo;
import haihuang.vo.DynamicVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


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

    @RequestMapping(value = "/getMessageCode",method = RequestMethod.POST,produces = "application/json")
    public CommenResp saveDynamic(DynamicLikeDiscussVo dynamicLikeDiscussVo){
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
}
