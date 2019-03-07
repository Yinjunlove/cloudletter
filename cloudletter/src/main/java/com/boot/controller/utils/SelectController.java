package com.boot.controller.utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: testSpringBoot
 * @description: 全选功能
 * @author: Jonny
 * @create: 2018-11-07 18:19
 **/
@Controller("utils.SelectController")
@RequestMapping(value="/utils")
public class SelectController {

    @RequestMapping(value="/select/all")
    @ResponseBody
    public ModelAndView selectAll() {
        return new ModelAndView("/views/utils/select");
    }
}
