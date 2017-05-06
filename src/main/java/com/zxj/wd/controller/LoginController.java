package com.zxj.wd.controller;

import com.zxj.wd.dao.IUserDao;
import com.zxj.wd.util.AjaxUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by chris on 2017/4/20.
 */
@RestController
public class LoginController {
    private static  final Logger log = LogManager.getLogger(LoginController.class);
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource
    private IUserDao userDao;
    @RequestMapping("/login")
    public Map login(){
        Map user = new HashMap();
        user.put("chris","中文测试");
        System.out.println("login test");
        return user;
    }

    @RequestMapping(path ="/listAllUsers")
    public List<Map> getAllUsers(){
        List<Map> result = new ArrayList<Map>();
        try {
            result = userDao.getAllUsers();
        }catch (Exception e){
            log.error(e);
        }
        return result;
    }

    @PostMapping(path = "/ajaxTest")
    public void ajax(HttpServletResponse response) throws Exception {

        AjaxUtils.rendJson(response,true,"this is ajax test.");

    }
}
