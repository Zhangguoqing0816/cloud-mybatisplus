package com.example.business.server.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther:
 * @Description:
 * @Date: 2020/3/20 9:35
 */
@FeignClient("custom-client2")
@Service
public interface MyClient2Service {

//    @GetMapping("/dept2/insert2")
    @RequestMapping(method = RequestMethod.GET,value = "/dept2/insert2")
    public void insert2();
}
