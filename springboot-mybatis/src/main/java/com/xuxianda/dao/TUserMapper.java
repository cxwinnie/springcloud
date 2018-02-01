package com.xuxianda.dao;

import com.xuxianda.entity.TUser;

import java.util.Map;

public interface TUserMapper {
    TUser selectByPK(Map map);
}