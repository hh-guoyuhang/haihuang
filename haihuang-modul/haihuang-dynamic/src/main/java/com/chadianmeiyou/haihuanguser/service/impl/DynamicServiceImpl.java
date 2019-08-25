package com.chadianmeiyou.haihuanguser.service.impl;

import com.chadianmeiyou.haihuanguser.dao.DynamicDao;
import com.chadianmeiyou.haihuanguser.service.DynamicService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import haihuang.bean.HhDynamic;
import haihuang.bean.HhDynamicDetails;
import haihuang.bean.HhDynamicLikeDetails;
import haihuang.enums.DynamicTypeEnum;
import haihuang.enums.MathNumberEnum;
import haihuang.resp.CommenResp;
import haihuang.resp.DynamicResp;
import haihuang.resp.UploadDownloadResp;
import haihuang.tools.UploadDownload;
import haihuang.utils.ClassUtils;
import haihuang.utils.serviceUtils.DynamicUtil;
import haihuang.vo.DynamicLikeDiscussVo;
import haihuang.vo.DynamicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    private DynamicDao dynamicDao;

    @Override
    public void saveDynamic(MultipartFile[] files, DynamicVo dynamicVo) throws Exception {

        HhDynamic hhDynamic = DynamicUtil.createHhDynamic(dynamicVo);
        HhDynamicDetails hhDynamicDetails = new HhDynamicDetails();
        if(DynamicTypeEnum.picture.getToString().equals(dynamicVo.getDynamicType().toString())){
            if(MathNumberEnum.One.getToString().equals(dynamicVo.getIsOnePicture())){
                MultipartFile multipartFile = files[0];
                CommenResp<UploadDownloadResp> uploadDownloadRespCommenResp = UploadDownload.uploadFile(multipartFile);
                hhDynamicDetails.setPhoto1(uploadDownloadRespCommenResp.getBody().getUrl());
            }else{
                for (int i = 1; i <=files.length; i++){
                    MultipartFile multipartFile = files[i-1];
                    String originalFilename = multipartFile.getOriginalFilename();
                    if(StringUtil.isEmpty(multipartFile.getOriginalFilename())){
                        break;
                    }
                    CommenResp<UploadDownloadResp> uploadDownloadRespCommenResp = UploadDownload.uploadFile(multipartFile);
                    String photo = "photo"+i;
                    ClassUtils.setValue(hhDynamicDetails,hhDynamicDetails.getClass(),photo,
                            HhDynamicDetails.class.getDeclaredField(photo).getType(),uploadDownloadRespCommenResp.getBody().getUrl());

                }

            }

        }else if(DynamicTypeEnum.video.getToString().equals(dynamicVo.getDynamicType().toString())){
            MultipartFile multipartFile = files[0];
            CommenResp<UploadDownloadResp> uploadDownloadRespCommenResp = UploadDownload.uploadFile(multipartFile);
            hhDynamicDetails.setVideo(uploadDownloadRespCommenResp.getBody().getUrl());
        }else if(DynamicTypeEnum.voice.getToString().equals(dynamicVo.getDynamicType().toString())){
            MultipartFile multipartFile = files[0];
            CommenResp<UploadDownloadResp> uploadDownloadRespCommenResp = UploadDownload.uploadFile(multipartFile);
            hhDynamicDetails.setVoice(uploadDownloadRespCommenResp.getBody().getUrl());
        }
        hhDynamicDetails.setWord(dynamicVo.getWord());

        dynamicDao.saveDynamic(hhDynamic);
        hhDynamicDetails.setDynamicId(hhDynamic.getId());
        dynamicDao.saveDynamicDetails(hhDynamicDetails);


    }

    @Override
    public PageInfo<DynamicResp> getDynamicList(DynamicVo dynamicVo, Page page) {
        PageInfo<DynamicResp> userResp = dynamicDao.selectDynamicByPage(dynamicVo,page);
        return userResp;
    }

    @Override
    public PageInfo<DynamicResp> queryDynamicList(DynamicVo dynamicVo, Page page) {
        PageInfo<DynamicResp> userResp = dynamicDao.selectDynamicByPage(dynamicVo,page);
        return userResp;
    }

    @Override
    public void saveDynamicLike(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        HhDynamicLikeDetails dynamicLikeDetails = DynamicUtil.createHhDynamicLike(dynamicLikeDiscussVo);
        dynamicDao.saveDynamicLike(dynamicLikeDetails);
    }


}
