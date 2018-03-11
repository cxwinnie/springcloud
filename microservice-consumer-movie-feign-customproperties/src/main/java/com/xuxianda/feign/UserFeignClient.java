package com.xuxianda.feign;

import com.config.TestConfiguration;
import com.xuxianda.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "microservice-provider-user" , configuration = TestConfiguration.class)
public interface UserFeignClient {

  @RequestLine("GET /simple/{id}")
  User findById(@Param("id") Long id);

}
