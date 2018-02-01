package com.xuxianda.controller;

import com.xuxianda.entity.TUser;
import com.xuxianda.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Xianda Xu on 2018/01/31 21:52.
 */
@RestController
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @RequestMapping("/selectByPK")
    public TUser selectByPK(){
        Map map = new HashMap();
        map.put("id",1);
        return tUserService.selectByPK(map);
    }

}
