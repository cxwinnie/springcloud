package com.xuxianda.controller;

import com.xuxianda.entity.User;
import com.xuxianda.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

  @Autowired
  private UserFeignClient userFeignClient;

  @GetMapping("/movie1/{id}")
  public User findById(@PathVariable Long id) {
    return this.userFeignClient.findById(id);
  }

}
