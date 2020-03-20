package com.eurekaClient.doMain;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@MapperScan("com.eurekaClient.doMain.mapper")
@Slf4j
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableDistributedTransaction  //开启分布式事务
public class EurekaClientApplication {

    public static void main(String[] args) {
        ConfigurableEnvironment environment = SpringApplication.run(EurekaClientApplication.class, args).getEnvironment();
        log.info(" \n client1 启动完毕  \n http://localhost:{}", environment.getProperty("server.port"));
    }

}
