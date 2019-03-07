package com.boot.controller.utils;

import com.boot.utils.Const;
import com.boot.utils.FileUitl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @program: testSpringBoot
 * @description: 上传和下载功能
 * @author: Jonny
 * @create: 2018-11-07 18:19
 **/
@Controller("utils.DownController")
@RequestMapping(value="/utils")
public class DownController {

    @RequestMapping(value="/updownload")
    @ResponseBody
    public ModelAndView selectAll() {
        return new ModelAndView("/views/utils/updownload");
    }




    //执行上传功能
    @RequestMapping(value = "/save", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public Object upload(@RequestParam("upload") MultipartFile file,Model model,HttpServletRequest request) throws FileNotFoundException {
        Map<String, Object> map = new HashMap<>();

        // 要上传的目标文件存放路径
        //获取跟目录
        File classpath = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!classpath.exists()) classpath = new File("");

        //如果上传目录为/static/images/upload/，则可以如下获取：
        File upload = new File(classpath.getAbsolutePath(),Const.UPLOADDIR);
        if(!upload.exists()) upload.mkdirs();
        String path = upload.getAbsolutePath();



        // 上传成功或者失败的提示
        String msg = "";

        if (FileUitl.upload(file, path, file.getOriginalFilename())){
            // 上传成功，给出页面提示
            msg = "上传成功！";
        }else {
            msg = "上传失败！";

        }

        // 显示图片
        map.put("msg", msg);
        map.put("fileName", file.getOriginalFilename());
        map.put("path", upload.getAbsolutePath());

        return map;
    }

}
