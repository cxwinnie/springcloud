package com.xuxianda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;

/**
 * Created by Xianda Xu on 2018/1/28.
 */
@SpringBootApplication
@MapperScan("com.xuxianda.dao")
public class HelloApplication extends SpringBootServletInitializer {

    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        converter.setWriteAcceptCharset(false);
        return converter;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(HelloApplication.class, args);
        //run.close();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //设置启动类，用于独立tomcat运行的入口
        return builder.sources(HelloApplication.class);
    }
}
