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
            //String fileName = file.getOriginalFilename();
            String fileName = UUID16.getUUID();
            //加个时间戳，尽量避免文件名称重复
            String path = "D:/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" + fileName;
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
            resp.setName(fileName);
            resp.setUrl(path);
        } catch (IOException e) {
            e.printStackTrace();
            commonResp.setType("E");
            commonResp.setMsg("系统异常！！");
            return commonResp;
        }

        commonResp.setBody(resp);
        return commonResp;
    }
    @RequestMapping("/uploadMultifile")
    @ResponseBody
    public String keywordSubmitFile(@RequestParam("fileName") List<MultipartFile> files) {
        for (MultipartFile file : files) {
            //这里简单输出文件名称
            System.out.println(file.getOriginalFilename());
        }
        return "0";
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
