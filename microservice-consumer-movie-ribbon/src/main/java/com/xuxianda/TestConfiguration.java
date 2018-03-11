package com.xuxianda;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Xianda Xu on 2018/3/8.
 */
@Configuration
@ExcludeFromComponentScan
public class TestConfiguration {

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();
    }

}
