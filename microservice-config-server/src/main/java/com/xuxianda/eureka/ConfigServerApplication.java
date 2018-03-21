package com.xuxianda.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Xianda Xu on 2018/03/01 14:46.
 */
@SpringBootApplication
@EnableConfigServer //使用EurekaServer做服务发现
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }

}
