package com.lz.demo.service;
import com.lz.demo.pojo.User;
import com.lz.demo.utils.Message;

/**
 * @author FUYI
 */
public interface UserService {
    Message login(String username, String userpwd);
}
