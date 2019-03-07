package com.boot.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @program: cloudletter
 * @description: 文件上传下载工具
 * @author: Jonny
 * @create: 2019-03-06 11:42
 **/
public class FileUitl {

    /**
     * 文件上传
     * @param file 文件
     * @param path 文件存放路径
     * @param fileName 源文件名
     * @return
     */
    public static boolean upload(MultipartFile file, String path, String fileName) {

        // 生成新的文件名
        //String realPath = path + "/" + FileNameUtils.getFileName(fileName);

        //使用原文件名
        String realPath = path + "/" + fileName;

        File dest = new File(realPath);

        //判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }

        try {
            //保存文件
            file.transferTo(dest);
            return true;
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 文件下载
     * @param file  文件
     * @param response
     * @param fileName  原文件名
     * @return
     * @throws Exception
     */
    public static String download(File file, HttpServletResponse response, String fileName) throws Exception {
        if (file.exists()) {
            response.setContentType("application/force-download");// 设置强制下载不打开
            response.addHeader("Content-Disposition", "attachment;fileName=" + new String(fileName.getBytes("GBK"), "iso-8859-1"));// 设置文件名
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }
}
