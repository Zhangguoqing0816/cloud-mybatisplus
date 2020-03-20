package com.example.business.server.controller;

import com.example.business.server.feign.MyClient1Service;
import com.example.business.server.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:
 * @Description:
 * @Date: 2020/3/19 17:10
 */

@RequestMapping("/business")
@RestController
public class MyController {

    @Autowired
    private MyService myService;


    @GetMapping("/insDept")
    public void insDept(){
        myService.insDept();
    }

    @GetMapping("/insDeptTo1")
    public void insDeptTo1(){
        myService.insDeptTo1();
    }

    @GetMapping("/insDeptTo2")
    public void insDeptTo2(){
        myService.insDeptTo2();
    }
}
