package com.dbexample.dbtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.dbexample.dbtest"})
@EnableAutoConfiguration
//@MapperScan("com.dbexample.dbtest.dao")//接口扫描，如果此处不加@MapperScan注解必须在接口类上添加@Mapper注解表明这是一个接口扫描器
public class DbtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbtestApplication.class, args);
    }

}