package com.xuxianda.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Xianda Xu on 2018/03/01 14:46.
 */
@SpringBootApplication
@EnableEurekaServer //使用EurekaServer做服务发现
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }

}
