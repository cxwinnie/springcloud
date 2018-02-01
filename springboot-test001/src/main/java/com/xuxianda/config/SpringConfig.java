package com.xuxianda.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.xuxianda.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


/**
 * Created by Xianda Xu on 2018/1/27.
 */
@Configuration   // 通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
@ComponentScan(basePackages = {"com.xuxianda"})   // 配置扫描包
@PropertySource(value = {"classpath:jdbc.properties"})
public class SpringConfig {

    @Bean
    public UserDao getUserDao(){
        return new UserDao();
    }

    @Value("${mysql.driver}")
    private String driver;

    @Value("${mysql.jdbcUrl}")
    private String url;

    @Value("${mysql.userName}")
    private String userName;

    @Value("${mysql.password}")
    private String password;

    @Bean(destroyMethod = "close")
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }

}
