package com.boot.demo.controller;

import com.boot.demo.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller("demoController")
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    private DemoServiceImpl demoService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public ModelAndView demo(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/views/demo/demolist");
        String uuid = "1111111111111111";
        Map param = new HashMap();
        param.put("uuid",uuid);
        mv.addObject("list", demoService.getDemoList(param));
        return mv;
    }
}
