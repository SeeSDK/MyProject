package com.rabbitmq.test;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: fuyi
 * @Description: //TODO 队列
 * @Param:
 * @Return:
 * @Date: 2020/1/10  16:10
 */
@Configuration
public class SendConfig {
    @Bean
    public Queue Queue(){
        return  new  Queue("hello,MyRabbitMQ");
    }
}
