package com.chadianmeiyou.haihuanguser.controller;


import com.chadianmeiyou.haihuanguser.service.DynamicService;
import haihuang.enums.SexEnum;
import haihuang.resp.CommenResp;
import haihuang.resp.MessageCode;
import haihuang.resp.UploadDownloadResp;
import haihuang.tools.UploadDownload;
import haihuang.vo.DynamicVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/dynamic")
public class DynamicController {
    private static Logger logger = Logger.getLogger(DynamicController.class);

    @Autowired
    private DynamicService dynamicService;
    /**
     * 新增动态
     * @return
     */
    @RequestMapping(value = "/getMessageCode",method = RequestMethod.POST,produces = "application/json")
    public CommenResp saveDynamic(@RequestParam("fileName") List<MultipartFile> files,@RequestParam("dynamicVo") DynamicVo dynamicVo){
        CommenResp resp = new CommenResp();
        try{

            dynamicService.saveDynamic(files,dynamicVo);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg(e.getMessage());
        }


        return null;
    }
}
