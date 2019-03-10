package com.boot.demo.service.impl;

import com.boot.demo.dao.DemoDao;
import com.boot.demo.domain.DemoInfo;
import com.boot.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoMapper;

    @Override
    public List<DemoInfo> getDemoList(Map param) {
        return demoMapper.getDemoList(param);
    }
}
