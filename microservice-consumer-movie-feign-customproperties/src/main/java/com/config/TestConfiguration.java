package com.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Xianda Xu on 2018/3/11.
 */
@Configuration
public class TestConfiguration {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
