package com.boot.letter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: cloudletter
 * @description: 信息传递
 * @author: Jonny
 * @create: 2019-03-04 16:52
 **/
@Controller("letterController")
@RequestMapping(value = "/letter")
public class LetterController {

    @RequestMapping(value = "/list")
    @ResponseBody
    public ModelAndView getList() throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/views/letter/index");
        return mv;
    }


    @RequestMapping(value = "/edit")
    @ResponseBody
    public ModelAndView edit(Model model) throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/views/letter/index");
        return mv;
    }
}
