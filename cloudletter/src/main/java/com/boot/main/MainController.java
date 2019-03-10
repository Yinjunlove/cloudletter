package com.boot.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/home")
    @ResponseBody
    public ModelAndView home() {
        return new ModelAndView("/views/home");
    }
}