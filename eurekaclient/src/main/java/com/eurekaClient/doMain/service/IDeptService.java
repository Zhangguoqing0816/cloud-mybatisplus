package com.eurekaClient.doMain.service;

import com.baomidou.mybatisplus.service.IService;
import com.eurekaClient.doMain.entity.DeptEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDeptService extends IService<DeptEntity> {

    DeptEntity queryById(@Param("id") Integer di);

    List<DeptEntity> queryAll();

    DeptEntity selectOneForMapper(DeptEntity deptEntity);
}
