package com.chadianmeiyou.haihuanguser.controller;


import com.chadianmeiyou.haihuanguser.service.UserService;
import haihuang.resp.CommenResp;
import haihuang.resp.UploadDownloadResp;
import haihuang.tools.UploadDownload;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;


@Controller
@RequestMapping(value = "/uploadDownload")
public class UploadDownloadController {
    private static Logger logger = Logger.getLogger(UploadDownloadController.class);

    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public String index()
    {
        return "index";
    }

    /**
     * 上传文件
     * @param file
     * @return
     */
    @RequestMapping("/uploadFile")
    @ResponseBody
    public CommenResp<UploadDownloadResp> uploadFile(@RequestParam("fileName") MultipartFile file) {
        CommenResp<UploadDownloadResp> uploadDownloadRespCommenResp = UploadDownload.uploadFile(file);

        return uploadDownloadRespCommenResp;
    }

    @RequestMapping("/downloadFile")
    @ResponseBody
    public String downloadFile(HttpServletResponse response, @RequestParam("fileName") String filePathName) {
        File file = new File(filePathName);
        if (!file.exists()) {
            return "-1";
        }

        response.reset();
        response.setHeader("Content-Disposition", "attachment;fileName=" + filePathName);

        try {
            InputStream inStream = new FileInputStream(filePathName);
            OutputStream os = response.getOutputStream();

            byte[] buff = new byte[1024];
            int len = -1;
            while ((len = inStream.read(buff)) > 0) {
                os.write(buff, 0, len);
            }
            os.flush();
            os.close();

            inStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            return "-2";
        }

        return "0";
    }

}
