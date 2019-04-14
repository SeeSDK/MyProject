package com.lz.demo.service.serviceImpl;

import com.lz.demo.mapper.UserMapper;
import com.lz.demo.pojo.User;
import com.lz.demo.service.UserService;
import com.lz.demo.utils.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author FUYI
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    public UserMapper userMapper;
    private static final Logger log= LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public Message login(String username, String userpwd) {
        Message message=new Message();
        Map reqUser = new HashMap();
        reqUser.put("username",username);
        reqUser.put("userpwd",userpwd);
       User user= userMapper.login(reqUser);
        log.info("查处的数据为"+user);
        if (user!=null){
            message.setData("000000");
            message.setMessage("查询成功");
            return message;
        }
        message.setData("999999");
        message.setMessage("查询失败");
        return message;
    }


}
