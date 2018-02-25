package com.xuxianda.controller;

import java.io.Serializable;

/**
 * Created by Xianda Xu on 2018/02/05 15:00.
 */
public class User implements Serializable{

    private static final long serialVersionUID = -2864080145414280762L;

    private String username;

    private Integer age;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
