package com.rabbitmq.test;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

/**
 * @Author: fuyi
 * @Description: //TODO 接收者  Consumer
 * @Param:
 * @Return:
 * @Date: 2020/1/10  16:19
 */
@Component
public class Receiver {
    @RabbitListener(queues = "hello,MyRabbitMQ")
    public void process(String msg){
        System.out.println("receiver:"+msg);
    }
}
