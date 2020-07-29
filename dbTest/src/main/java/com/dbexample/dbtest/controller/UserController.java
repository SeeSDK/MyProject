package com.dbexample.dbtest.controller;

import com.dbexample.dbtest.service.userService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: fuyi
 * @Description: //TODO
 * @Param:
 * @Return:
 * @Date: 2019/10/31  10:49
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static  final Logger log= LoggerFactory.getLogger(UserController.class);
    @Autowired
    userService userService;

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    @ResponseBody
    public String login(String username, String userPwd) {
        username = "fuyi";
        userPwd = "123456";
        Map user =new HashMap<>();
        user.put("nickname",username);
        user.put("userpwd",userPwd);
        log.info(user.toString());
        String message = userService.login(user);
        return message;

    }
}
