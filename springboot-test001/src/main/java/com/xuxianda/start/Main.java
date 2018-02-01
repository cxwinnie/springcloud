package com.xuxianda.start;

import com.xuxianda.config.SpringConfig;
import com.xuxianda.entity.User;
import com.xuxianda.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by Xianda Xu on 2018/1/27.
 */
public class Main {

    public static void main(String[] args) {
        // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 在Spring容器中获取Bean对象
        UserService userService = context.getBean(UserService.class);

        // 调用对象中的方法
        List<User> list = userService.queryUserList();
        for (User user : list) {
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", " + user.getPassword());
        }

        // 销毁该容器
        context.destroy();
    }

}
