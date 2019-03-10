package com.boot.demo.service;

import com.boot.demo.domain.DemoInfo;

import java.util.List;
import java.util.Map;

public interface DemoService {
    public List<DemoInfo>  getDemoList(Map param);
}
