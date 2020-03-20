package com.example.eurekaclient2.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.example.eurekaclient2.entity.DeptEntity;
import com.example.eurekaclient2.feign.MyClient1Service;
import com.example.eurekaclient2.mapper.DeptMapper;
import com.example.eurekaclient2.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, DeptEntity> implements IDeptService {

    @Autowired
    private DeptMapper mDeptMapper;
    @Autowired
    private MyClient1Service myClient1Service;

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

    @Override
    @Transactional
    @LcnTransaction
    public void insertDept2(DeptEntity entity) {
        Integer insert = mDeptMapper.insert(entity);
        System.out.println("insert2 result:" + insert);
        myClient1Service.insert1();
    }

}
