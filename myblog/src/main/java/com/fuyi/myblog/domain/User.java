package com.fuyi.myblog.domain;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *Author fuyi
 *ClassName User
 *Description
 *Param
 *Return
 *Date  2019/7/16 22:52
 */
@Entity
public class User {
    @Id
    public String id ;
    public String name;
    public String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    protected User(String o, Object name, Object email) { //防止直接使用
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public User(String id ,String name, String email) {
        this.id=id;
        this.name = name;
        this.email = email;
    }

}
