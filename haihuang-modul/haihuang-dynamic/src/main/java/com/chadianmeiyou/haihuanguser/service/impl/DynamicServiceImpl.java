package com.chadianmeiyou.haihuanguser.service.impl;

import com.chadianmeiyou.haihuanguser.dao.DynamicDao;
import com.chadianmeiyou.haihuanguser.service.DynamicService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import haihuang.bean.*;
import haihuang.enums.DynamicTypeEnum;
import haihuang.enums.MathNumberEnum;
import haihuang.resp.*;
import haihuang.tools.UploadDownload;
import haihuang.utils.CacheContents;
import haihuang.utils.ClassUtils;
import haihuang.utils.RedisConfiguration;
import haihuang.utils.serviceUtils.DynamicUtil;
import haihuang.utils.serviceUtils.UserUtil;
import haihuang.vo.DynamicLikeDiscussVo;
import haihuang.vo.DynamicTopicVo;
import haihuang.vo.DynamicVo;
import haihuang.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Component
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    private DynamicDao dynamicDao;
    @Autowired
    private RedisConfiguration redisConfiguration;
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
        HhDynamicTopic hhDynamicTopic = new HhDynamicTopic();
        hhDynamicTopic.setTopic(hhDynamic.getTopic());
        dynamicDao.insertDynamicTopic(hhDynamicTopic);

    }

    @Override
    public PageInfo<DynamicResp> getDynamicList(DynamicVo dynamicVo, Page page) {
        PageInfo<DynamicResp> userResp = dynamicDao.selectDynamicByPage(dynamicVo,page);
        return userResp;
    }

    @Override
    public PageInfo<DynamicResp> queryDynamicList(DynamicVo dynamicVo, Page page) {
        PageInfo<DynamicResp> userResp = dynamicDao.selectDynamicByPage(dynamicVo,page);
        List<DynamicResp> list = userResp.getList();
        for (DynamicResp resp :list){
            HhUser user = (HhUser) redisConfiguration.vos().get(CacheContents.USERKEY+resp.getUserId().toString());
            UserVo respvo = UserUtil.createHhUserToUserVo(user);
            resp.setUserVo(respvo);
        }
        return userResp;
    }

    @Override
    public DynamicLikeDetailsResp queryDynamicLike(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        HhDynamicLikeDetails dynamicLikeDetails = DynamicUtil.createHhDynamicLike(dynamicLikeDiscussVo);
        DynamicLikeDetailsResp resp = new DynamicLikeDetailsResp();
        List<HhDynamicLikeDetails> list = dynamicDao.queryDynamicLike(dynamicLikeDetails);
        if(null != list){
            for (HhDynamicLikeDetails details :list){
                HhUser user = (HhUser) redisConfiguration.vos().get(CacheContents.USERKEY+details.getUserId().toString());
                UserVo respvo = UserUtil.createHhUserToUserVo(user);
                details.setUserVo(respvo);
            }
            resp.setRespList(list);
            resp.setCount(list.size());

        }
        return resp;
    }

    @Override
    public void saveDynamicLike(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        HhDynamicLikeDetails dynamicLikeDetails = DynamicUtil.createHhDynamicLike(dynamicLikeDiscussVo);
        dynamicDao.saveDynamicLike(dynamicLikeDetails);
    }

    @Override
    public void saveDynamicDiscuss(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        HhDynamicDiscussDetails dynamicDiscussDetails = DynamicUtil.createHhDynamicDiscuss(dynamicLikeDiscussVo);
        dynamicDao.saveDynamicDiscuss(dynamicDiscussDetails);
    }

    @Override
    public DynamicLikeDetailsResp queryDynamicDiscussOne(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        HhDynamicDiscussDetails dynamicDiscussDetails = DynamicUtil.createHhDynamicDiscuss(dynamicLikeDiscussVo);
        DynamicLikeDetailsResp resp = new DynamicLikeDetailsResp();
        List<HhDynamicDiscussDetails> list = dynamicDao.queryDynamicDiscussOne(dynamicDiscussDetails);
        if(null != list){
            for (HhDynamicDiscussDetails details :list){
                HhUser user = (HhUser) redisConfiguration.vos().get(CacheContents.USERKEY+details.getUserId().toString());
                UserVo respvo = UserUtil.createHhUserToUserVo(user);
                details.setUserVo(respvo);
            }
            resp.setRespList(list);
            resp.setCount(list.size());

        }
        return resp;
    }

    @Override
    public DynamicLikeDetailsResp queryDynamicDiscussTwo(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        HhDynamicDiscussDetails dynamicDiscussDetails = DynamicUtil.createHhDynamicDiscuss(dynamicLikeDiscussVo);
        DynamicLikeDetailsResp resp = new DynamicLikeDetailsResp();
        List<HhDynamicDiscussDetails> list = dynamicDao.queryDynamicDiscussTwo(dynamicDiscussDetails);
        if(null != list){
            for (HhDynamicDiscussDetails details :list){
                HhUser user = (HhUser) redisConfiguration.vos().get(CacheContents.USERKEY+details.getUserId().toString());
                UserVo respvo = UserUtil.createHhUserToUserVo(user);
                details.setUserVo(respvo);
            }
            resp.setRespList(list);
            resp.setCount(list.size());

        }
        return resp;
    }

    @Override
    public void saveDiscussLike(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        HhDiscussLikeDetails dynamicDiscussDetails = DynamicUtil.createHhDiscussLike(dynamicLikeDiscussVo);
        dynamicDao.saveDiscussLike(dynamicDiscussDetails);
    }

    @Override
    public DynamicLikeDetailsResp queryDiscussLike(DynamicLikeDiscussVo dynamicLikeDiscussVo) {
        HhDiscussLikeDetails dynamicDiscussDetails = DynamicUtil.createHhDiscussLike(dynamicLikeDiscussVo);
        DynamicLikeDetailsResp resp = new DynamicLikeDetailsResp();
        List<HhDiscussLikeDetails> list = dynamicDao.queryDiscussLike(dynamicDiscussDetails);
        if(null != list){
            for (HhDiscussLikeDetails details :list){
                HhUser user = (HhUser) redisConfiguration.vos().get(CacheContents.USERKEY+details.getUserId().toString());
                UserVo respvo = UserUtil.createHhUserToUserVo(user);
                details.setUserVo(respvo);
            }
            resp.setRespList(list);
            resp.setCount(list.size());

        }
        return resp;
    }

    @Override
    public List<DynamicTopicResp> queryDynamicTopic(DynamicTopicVo dynamicTopicVo) {
        HhDynamicTopic hhDynamicTopic = DynamicUtil.createDynamicTopicByVo(dynamicTopicVo);
        List<HhDynamicTopic> hhDynamicTopicResp = dynamicDao.queryDynamicTopic(hhDynamicTopic);
        List<DynamicTopicResp> resp = DynamicUtil.createDynamicTopicRespByEntityList(hhDynamicTopicResp);
        return resp;
    }

    @Override
    public void editDynamicTopic(DynamicTopicVo dynamicTopicVo) {
        HhDynamicTopic hhDynamicTopic = DynamicUtil.createDynamicTopicByVo(dynamicTopicVo);
        if(null != dynamicTopicVo.getId()){
            dynamicDao.updateDynamicTopic(hhDynamicTopic);
        }else{
            dynamicDao.saveeDynamicTopic(hhDynamicTopic);
        }
    }


}
