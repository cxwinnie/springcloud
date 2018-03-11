package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Xianda Xu on 2018/3/1.
 */
@SpringBootApplication
@EnableDiscoveryClient    //@EnableEurekaClient
public class ProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class,args);
    }

}
