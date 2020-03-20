package com.example.eurekaclient2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther:
 * @Description:
 * @Date: 2020/3/19 17:11
 */
@Service
@FeignClient("custom-client1")
public interface MyClient1Service {

    @RequestMapping(method = RequestMethod.GET,value = "/dept1/insert1")
    public void insert1();
}
