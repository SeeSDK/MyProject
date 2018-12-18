package com.fuyi.spring_cloud.test1.Respository.iml;

import com.fuyi.spring_cloud.test1.pojo.User;

import java.util.List;

public interface UserRepository {
    /**
     * Author fuyi
     * ClassName UserRespository
     * Description 新增或修改用户
     * Param  user
     * Return
     * Date  2018/11/11 20:35
     */
    User saveOrUpadateUser(User user);

    /**
     * Author fuyi
     * ClassName UserRespository
     * Description 删除用户
     * Param  id
     * Return
     * Date  2018/11/11 20:36
     */
    void deleteUser(Long id);

    /**
     * Author fuyi
     * ClassName UserRespository
     * Description 通过用户Id 获取用户
     * Param  id
     * Return
     * Date  2018/11/11 20:37
     */
    User getUserById(Long id);

    /**
     * Author fuyi
     * ClassName UserRespository
     * Description 获取用户列表
     * Param
     * Return
     * Date  2018/11/11 20:38
     */
    List<User> listUser();

}
