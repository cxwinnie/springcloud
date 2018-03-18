package com.xuxianda.feign;

import com.xuxianda.entity.User;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Xianda Xu on 2018/3/18.
 */
public class HystrixClientFallback implements UserFeignClient{
    @Override
    public User findById(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }
}
