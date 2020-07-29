package com.rabbitmq.test;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: fuyi
 * @Description: //TODO  发送者 provide
 * @Param:
 * @Return:
 * @Date: 2020/1/10  16:14
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitMqTemplate;

    public void send() {
        String msg="hello"+new Date();
        this.rabbitMqTemplate.convertAndSend("hello,MyRabbitMQ",msg);
    }
}
