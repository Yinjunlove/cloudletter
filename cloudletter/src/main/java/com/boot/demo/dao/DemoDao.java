package com.boot.demo.dao;

import com.boot.demo.domain.DemoInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoDao {
    public List<DemoInfo> getDemoList(Map param);
}
