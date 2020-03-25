package com.eurekaClient.doMain.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.eurekaClient.doMain.entity.DeptEntity;
import com.eurekaClient.doMain.feign.Client2Feign;
import com.eurekaClient.doMain.mapper.DeptMapper;
import com.eurekaClient.doMain.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, DeptEntity> implements IDeptService {

    @Autowired
    private DeptMapper mDeptMapper;

    @Autowired
    private Client2Feign client2Feign;


    @Override
    public DeptEntity queryById(Integer id) {
        return mDeptMapper.queryById(id);
//        return null;
    }

    @Override
    public List<DeptEntity> queryAll() {
        return mDeptMapper.queryAll();
//        return null;
    }

    @Override
    public DeptEntity selectOneForMapper(DeptEntity request) {
        DeptEntity deptEntity = mDeptMapper.selectOne(request);
        return deptEntity;
    }

    @LcnTransaction
    @Transactional
    @Override
    public String insertClient1(String isFlag) {

        System.out.println(" come in  client1");
        DeptEntity deptEntity = new DeptEntity();
        deptEntity.setId("1");
        deptEntity.setDeptName("DEPT_01");
        System.out.println(deptEntity);
        deptEntity.setDeptContent(deptEntity.getDeptName());
        mDeptMapper.add(deptEntity);


        try {
            String resu2 = client2Feign.insertClient2(isFlag);
        } catch (Exception e) {
            throw new RuntimeException("Error client2");
        }

        if ("a".equals(isFlag)) {
            throw new RuntimeException("client1 param  ' a ' to error");
        }

        return " no problem ...";
    }
}
