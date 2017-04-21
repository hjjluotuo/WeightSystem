package com.zxj.wd.controller;

import com.zxj.wd.dao.IUserDao;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by chris on 2017/4/20.
 */
@RestController
public class LoginController {
    private static  final Logger log = Logger.getLogger(LoginController.class);
    @Resource
    private IUserDao userDao;
    @RequestMapping("/login")
    public Map login(){
        Map user = new HashMap();
        user.put("chris","中文测试");
        System.out.println("login test");
        return user;
    }

    @RequestMapping(value ="/listAllUsers")
    public List<Map> getAllUsers(){
        List<Map> result = new ArrayList<Map>();
        try {
            result = userDao.getAllUsers();
        }catch (Exception e){
            log.error(e);
        }
        return result;
    }
}
