package com.xuxianda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Xianda Xu on 2018/02/05 14:51.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/hello")
    public String index() {
        // 保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "111");
        String string = stringRedisTemplate.opsForValue().get("aaa");
        System.out.println(string);

        // 保存对象
        User user = new User("超人", 20);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new User("蝙蝠侠", 30);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new User("蜘蛛侠", 40);
        redisTemplate.opsForValue().set(user.getUsername(), user);
        User user1 = (User)redisTemplate.opsForValue().get("超人");
        System.out.println(user1.getAge().longValue());
        System.out.println(((User)redisTemplate.opsForValue().get("蝙蝠侠")).getAge().longValue());
        System.out.println(((User)redisTemplate.opsForValue().get("蜘蛛侠")).getAge().longValue());

        return "Hello World";
    }

}
