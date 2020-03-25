package com.example.eurekaclient2.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.eurekaclient2.entity.DeptEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDeptService2 extends IService<DeptEntity> {

    DeptEntity queryById(@Param("id") Integer di);

    List<DeptEntity> queryAll();

    DeptEntity selectOneForMapper(DeptEntity deptEntity);

    String insertClient2(String isFlag);
}
