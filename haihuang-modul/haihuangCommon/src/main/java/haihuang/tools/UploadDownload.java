package haihuang.tools;


import haihuang.resp.CommenResp;
import haihuang.resp.UploadDownloadResp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UploadDownload {

    private static final String PATH = "/root/haihuang/picture/image/";

    public static CommenResp<UploadDownloadResp> uploadFile(@RequestParam("fileName") MultipartFile file) {
        CommenResp<UploadDownloadResp> commonResp = new CommenResp<UploadDownloadResp>();
        UploadDownloadResp resp = new UploadDownloadResp();
        //判断文件是否为空
        if (file.isEmpty()) {
            commonResp.setType("E");
            commonResp.setMsg("文件不能为空！！");
            return commonResp;
        }
        try {
            String suffix = null;//后缀
            String orgFileName = file.getOriginalFilename();
            suffix = orgFileName.split("\\.")[1];
            String fileName = UUID16.getUUID();//文件名
            //加个时间戳，尽量避免文件名称重复
            fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" + fileName;
            String path = PATH +fileName +"."+suffix;
            File dest = new File(path);

            //判断文件是否已经存在
            if (dest.exists()) {
                commonResp.setType("E");
                commonResp.setMsg("文件已经存在！！");
                return commonResp;
            }

            //判断文件父目录是否存在
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdir();
            }

            file.transferTo(dest); //保存文件
            resp.setName(fileName+"."+suffix);
            resp.setUrl(path);
        } catch (IOException e) {
            e.printStackTrace();
            commonResp.setType("E");
            commonResp.setMsg("网络异常！");
            return commonResp;
        }

        commonResp.setBody(resp);
        return commonResp;
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
