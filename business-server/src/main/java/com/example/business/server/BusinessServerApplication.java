package com.example.business.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
@Slf4j
public class BusinessServerApplication {

    public static void main(String[] args) {
        ConfigurableEnvironment environment = SpringApplication.run(BusinessServerApplication.class, args).getEnvironment();
        log.info("  \n business server 启动成功  \n  http://localhost:{}", environment.getProperty("server.port"));
    }

}
