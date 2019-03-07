package com.boot.controller;

import com.boot.domain.TestInfo;
import com.boot.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: testSpringBoot
 * @description: 测试
 * @author: Jonny
 * @create: 2018-12-26 12:22
 **/
@Controller("testController")
@RequestMapping(value = "/test")
public class TestController {

    @Resource(name = "testService")
    private TestService testService;

    @RequestMapping(value="/getList")
    @ResponseBody
    public List<TestInfo> getTestList() throws Exception{
        List<TestInfo> testInfoList = testService.getTestList();
        return testInfoList;
    }
}
