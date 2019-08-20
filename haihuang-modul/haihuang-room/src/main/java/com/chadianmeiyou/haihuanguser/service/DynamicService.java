package com.chadianmeiyou.haihuanguser.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.resp.UploadDownloadResp;
import haihuang.vo.DynamicVo;
import haihuang.vo.UserVo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface DynamicService {
    /**
     * 新增动态
     * @param respList
     * @param dynamicVo
     */
    public void saveDynamic(List<MultipartFile> respList, DynamicVo dynamicVo);
}
