package com.lz.demo.controller;
import com.lz.demo.service.UserService;
import com.lz.demo.utils.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author FUYI
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    UserService userService;
    private static final Logger log= LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = {"/login"},method = RequestMethod.POST)
    @ResponseBody
    public Message login(String username, String userpwd ) {
             username ="fuyi";
             userpwd= "111";
        Message message=  userService.login(username,userpwd);
        return  message;

    }
}
