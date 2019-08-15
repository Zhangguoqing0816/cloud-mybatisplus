package com.eurekaClient.doMain.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eurekaClient.doMain.entity.DeptEntity;
import com.eurekaClient.doMain.mapper.DeptMapper;
import com.eurekaClient.doMain.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, DeptEntity> implements IDeptService {

    @Autowired
    private DeptMapper mDeptMapper;

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

}
