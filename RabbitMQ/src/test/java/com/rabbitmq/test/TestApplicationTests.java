package com.rabbitmq.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest(classes =TestApplication.class )
class TestApplicationTests {
    @Autowired
    private  Sender sender;
    @Test
    public void send (){
        this.sender.send();
    }

    @Test
    void contextLoads() {
    }

}
