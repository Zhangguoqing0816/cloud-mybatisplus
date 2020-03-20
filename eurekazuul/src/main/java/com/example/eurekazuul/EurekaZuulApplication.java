package com.example.eurekazuul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
@EnableZuulProxy
public class EurekaZuulApplication {

    public static void main(String[] args) {
        ConfigurableEnvironment environment = SpringApplication.run(EurekaZuulApplication.class, args).getEnvironment();
        log.info(" \n zuul 启动成功  \n http://localhost:{}", environment.getProperty("server.port"));
    }

}
