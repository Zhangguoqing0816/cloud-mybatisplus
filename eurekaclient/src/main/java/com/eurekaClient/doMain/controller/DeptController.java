package com.eurekaClient.doMain.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.eurekaClient.doMain.entity.DeptEntity;
import com.eurekaClient.doMain.service.IDeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept1")
@Api(tags = "DeptController", description = "DeptController-Des")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @ApiOperation(value = "queryById/{id}", notes = "queryById-notes")
    @GetMapping("/queryById/{id}")
    public DeptEntity queryById(@PathVariable String id){
        DeptEntity deptEntity = null;
        if(StringUtils.isNotBlank(id)){
            deptEntity = deptService.queryById(Integer.valueOf(id));
        }
        return deptEntity;
    }

    @ApiOperation(value = "queryAll", notes = "queryAll-notes")
    @GetMapping("/queryAll")
    public List<DeptEntity> queryAll(){
        List<DeptEntity> deptEntity = deptService.queryAll();
        return deptEntity;
    }

    @ApiOperation(value = "queryOne", notes = "queryAll-notes")
    @GetMapping("/queryOne")
    public DeptEntity queryOne(){
        Wrapper<DeptEntity> wrapper = new EntityWrapper<DeptEntity>().eq("dept_Name","zhang");
        DeptEntity deptEntity = deptService.selectOne(wrapper);
        return deptEntity;
    }

    @ApiOperation(value = "queryOneForMapper", notes = "queryAll-notes")
    @GetMapping("/queryOneForMapper")
    public DeptEntity queryOneForMapper(DeptEntity request){
        DeptEntity deptEntity = deptService.selectOneForMapper(request);
        return deptEntity;
    }

    @ApiOperation(value = "selectListNo", notes = "queryAll-notes")
    @GetMapping("/selectListNo")
    public List<DeptEntity> selectListNo(){
        Wrapper<DeptEntity> wrapper = new EntityWrapper<DeptEntity>().eq("dept_content","zhang");
        List<DeptEntity> deptEntities = deptService.selectList(wrapper);
        return deptEntities;
    }

    @ApiOperation(value = "insert1", notes = "insert1")
    @GetMapping("/insert1")
    @Transactional//分布式事务
    @LcnTransaction//本地事务注解
    public void insert1(){
        System.out.println(" come in  client1");
        DeptEntity deptEntity = new DeptEntity();
        deptEntity.setId("1");
        deptEntity.setDeptName("DEPT_01");
        System.out.println(deptEntity);
        deptEntity.setDeptContent(deptEntity.getDeptName());
        deptService.insert(deptEntity);
    }
}
