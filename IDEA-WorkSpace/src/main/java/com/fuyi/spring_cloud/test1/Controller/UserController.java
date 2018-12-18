package com.fuyi.spring_cloud.test1.Controller;

import com.fuyi.spring_cloud.test1.Respository.iml.UserRepository;

import com.fuyi.spring_cloud.test1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * Author fuyi
     * ClassName ${classname()}
     * Param  获取用户列表
     * Return
     * Date  2018/11/11 19:57
     */
    @GetMapping
    public List<User> getUser() {
        return userRepository.listUser();

    }

    /**
     * Author fuyi
     * ClassName ${classname()}
     * Param  获取用户信息
     * Return
     * Date  2018/11/11 20:00
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userRepository.getUserById(id);
    }

    /**
     * Author fuyi
     * ClassName UserController
     * Description 保存用户信息
     * Param  user
     * Return
     * Date  2018/11/11 20:05
     */
    @PostMapping
    public User creatUser(@RequestBody User user) {
        return userRepository.saveOrUpadateUser(user);
    }

    /**
     * Author fuyi
     * ClassName UserController
     * Description 修改用户
     * Param  id
     * Return user
     * Date  2018/11/11 20:17
     */
    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        User oldUser = this.getUser(id);
        if (oldUser != null) {
            user.setId(id);
            userRepository.saveOrUpadateUser(user);
        }
    }

    /**
     * Author fuyi
     * ClassName UserController
     * Description 删除用户
     * Param  id
     * Return
     * Date  2018/11/11 20:20
     */
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")  //制定角色权限才能操作此方法
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userRepository.deleteUser(id);
    }
}
