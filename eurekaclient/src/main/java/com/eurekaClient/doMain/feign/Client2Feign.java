package com.eurekaClient.doMain.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther:
 * @Description:
 * @Date: 2020/3/25 13:03
 */
@FeignClient("custom-client2")
public interface Client2Feign {

    @GetMapping("/dept2/insertClient2")
    public String insertClient2(@RequestParam String isFlag);
}
