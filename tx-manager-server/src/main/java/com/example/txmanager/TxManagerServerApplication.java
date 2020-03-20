package com.example.txmanager;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

@Slf4j
@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagerServer
public class TxManagerServerApplication {

    public static void main(String[] args) {
        ConfigurableEnvironment environment = SpringApplication.run(TxManagerServerApplication.class, args).getEnvironment();
        log.info(" \n tx-manager-server 启动完成 \n  http://localhost:{}", environment.getProperty("server.port"));
    }

}
