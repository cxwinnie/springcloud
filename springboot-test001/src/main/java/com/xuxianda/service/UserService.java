package com.xuxianda.service;

import com.xuxianda.dao.UserDao;
import com.xuxianda.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Xianda Xu on 2018/1/27.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> queryUserList() {
        // 调用userDAO中的方法进行查询
        return userDao.queryUserList();
    }
}
