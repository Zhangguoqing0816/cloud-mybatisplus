package com.example.eurekaclient2.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.eurekaclient2.entity.DeptEntity;
import com.example.eurekaclient2.mapper.DeptMapper2;
import com.example.eurekaclient2.service.IDeptService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptServiceImpl2 extends ServiceImpl<DeptMapper2, DeptEntity> implements IDeptService2 {

    @Autowired
    private DeptMapper2 mDeptMapper;

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
    public String insertClient2(String isFlag) {
        DeptEntity deptEntity = new DeptEntity();
        deptEntity.setId("1");
        deptEntity.setDeptName("DEPT_02");
        deptEntity.setDeptContent(deptEntity.getDeptName());
        System.out.println(deptEntity);
        Integer insert = mDeptMapper.add(deptEntity);
        System.out.println("insert2 result:" + insert);

        if ("b".equals(isFlag)) {
            throw new RuntimeException("client2 param  ' b ' to error one");
        }

        return "client 2 nO Problem";
    }

}
