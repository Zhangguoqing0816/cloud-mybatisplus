package com.example.business.server.service;

import com.example.business.server.feign.MyClient1Service;
import com.example.business.server.feign.MyClient2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther:
 * @Description:
 * @Date: 2020/3/20 9:34
 */
@Service
public class MyService {

    @Autowired
    private MyClient1Service myClient1Service;
    @Autowired
    private MyClient2Service myClient2Service;

    @Transactional
    public void insDept(){
        myClient2Service.insert2();
        myClient1Service.insert1();
    }

    public void insDeptTo1(){
        myClient1Service.insert1();
    }

    public void insDeptTo2(){
        myClient2Service.insert2();
    }
}
