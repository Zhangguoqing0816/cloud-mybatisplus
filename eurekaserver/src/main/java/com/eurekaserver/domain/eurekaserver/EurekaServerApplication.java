package com.eurekaserver.domain.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    private static final Logger logger = LoggerFactory.getLogger(EnableEurekaServer.class);

    public static void main(String[] args) {
        ConfigurableEnvironment environment = SpringApplication.run(EurekaServerApplication.class, args).getEnvironment();
        logger.info(" \n   eurekaServer 已启动  \n   http://localhost:{}/", environment.getProperty("server.port"));
    }

}
