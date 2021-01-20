package com.seesdk.microcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.seesdk.microcloud.dao")
public class Dept_8001_SrartSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(Dept_8001_SrartSpringCloudApplication.class,args);
    }
}
