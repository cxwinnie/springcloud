package com.xuxianda.service.impl;

import com.xuxianda.dao.TUserMapper;
import com.xuxianda.entity.TUser;
import com.xuxianda.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Xianda Xu on 2018/01/31 21:51.
 */
@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public TUser selectByPK(Map map) {
        return tUserMapper.selectByPK(map);
    }
}
