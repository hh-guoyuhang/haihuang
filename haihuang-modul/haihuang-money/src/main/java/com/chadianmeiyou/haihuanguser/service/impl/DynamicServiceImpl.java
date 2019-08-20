package com.chadianmeiyou.haihuanguser.service.impl;

import com.chadianmeiyou.haihuanguser.dao.DynamicDao;
import com.chadianmeiyou.haihuanguser.service.DynamicService;
import haihuang.bean.HhDynamic;
import haihuang.bean.HhDynamicDetails;
import haihuang.enums.DynamicTypeEnum;
import haihuang.enums.MathNumberEnum;
import haihuang.resp.CommenResp;
import haihuang.resp.UploadDownloadResp;
import haihuang.tools.UploadDownload;
import haihuang.utils.serviceUtils.DynamicUtil;
import haihuang.vo.DynamicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    private DynamicDao dynamicDao;

    @Override
    public void saveDynamic(List<MultipartFile> files, DynamicVo dynamicVo) {
        List<UploadDownloadResp> respList = new ArrayList<UploadDownloadResp>();

        HhDynamic hhDynamic = DynamicUtil.createHhDynamic(dynamicVo);
        HhDynamicDetails hhDynamicDetails = new HhDynamicDetails();
        if(String.valueOf(DynamicTypeEnum.picture).equals(dynamicVo.getDynamicType())){
            if(String.valueOf(MathNumberEnum.One).equals(dynamicVo.getIsOnePicture())){
                MultipartFile multipartFile = files.get(0);
                CommenResp<UploadDownloadResp> uploadDownloadRespCommenResp = UploadDownload.uploadFile(multipartFile);
                hhDynamicDetails.setPhoto1(uploadDownloadRespCommenResp.getBody().getUrl());
            }else{
                for (MultipartFile file : files) {
                    CommenResp<UploadDownloadResp> uploadDownloadRespCommenResp = UploadDownload.uploadFile(file);
                    respList.add(uploadDownloadRespCommenResp.getBody());
                   // hhDynamicDetails.setPhoto1();
                }
            }

        }else if(String.valueOf(DynamicTypeEnum.video).equals(dynamicVo.getDynamicType())){
            MultipartFile multipartFile = files.get(0);
            CommenResp<UploadDownloadResp> uploadDownloadRespCommenResp = UploadDownload.uploadFile(multipartFile);
            hhDynamicDetails.setVideo(uploadDownloadRespCommenResp.getBody().getUrl());
        }else if(String.valueOf(DynamicTypeEnum.voice).equals(dynamicVo.getDynamicType())){
            MultipartFile multipartFile = files.get(0);
            CommenResp<UploadDownloadResp> uploadDownloadRespCommenResp = UploadDownload.uploadFile(multipartFile);
            hhDynamicDetails.setVoice(uploadDownloadRespCommenResp.getBody().getUrl());
        }
        hhDynamicDetails.setWord(dynamicVo.getWord());


        dynamicDao.saveDynamic(hhDynamic);
        hhDynamicDetails.setDynamicId(hhDynamic.getId());
        dynamicDao.saveDynamicDetails(hhDynamicDetails);


    }



}
