package com.dbexample.dbtest.service;

import com.dbexample.dbtest.dao.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: fuyi
 * @Description: //TODO
 * @Param:
 * @Return:
 * @Date: 2019/10/31  10:50
 */
@Service
public class userService {
    private static  final Logger log= LoggerFactory.getLogger(userService.class);
    @Autowired
    UserMapper userMapper;

    public String login(Map record) {
        String  result= userMapper.login(record);
        log.info(result);
        if ("1".equals(result)) {
            return "success";
        }else{
            return "failed";
        }
    }

}
