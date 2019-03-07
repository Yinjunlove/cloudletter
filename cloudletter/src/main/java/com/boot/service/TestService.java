package com.boot.service;

import com.boot.dao.DaoSupport;
import com.boot.domain.TestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: testSpringBoot
 * @description: 测试
 * @author: Jonny
 * @create: 2018-12-26 12:18
 **/
@Service("testService")
public class TestService{

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    public List<TestInfo> getTestList() throws Exception{
        return (List<TestInfo>) dao.findForList("TestMapper.getTestList","");
    }
}
