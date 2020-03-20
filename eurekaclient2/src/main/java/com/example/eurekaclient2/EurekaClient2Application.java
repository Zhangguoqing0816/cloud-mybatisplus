package com.example.eurekaclient2;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.ConfigurableEnvironment;

@Slf4j
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableDistributedTransaction  //开启分布式事务
public class EurekaClient2Application {

    public static void main(String[] args) {
        ConfigurableEnvironment environment = SpringApplication.run(EurekaClient2Application.class, args).getEnvironment();
        log.info(" \n client2 启动成功 \n http://localhost:{}" , environment.getProperty("server.port"));
    }

}
