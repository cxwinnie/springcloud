package com.xuxianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import redis.clients.jedis.JedisCluster;

/**
 * Created by Xianda Xu on 2018/1/28.
 */
@SpringBootApplication
@ComponentScan("com.xuxianda")
public class HelloApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(HelloApplication.class, args);
        JedisCluster jedisCluster = run.getBean(JedisCluster.class);
        jedisCluster.set("userName","zhangsan");
        jedisCluster.set("password","123456");
        System.out.println(jedisCluster.get("userName"));
        System.out.println(jedisCluster.get("password"));
    }

}
