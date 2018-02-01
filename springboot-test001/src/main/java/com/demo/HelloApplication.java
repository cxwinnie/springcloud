package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;

/**
 * Created by Xianda Xu on 2018/1/28.
 */
@Controller
@SpringBootApplication
public class HelloApplication extends SpringBootServletInitializer {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world！噓噓";
    }


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
