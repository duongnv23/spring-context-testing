package com.duongnv.spring.context.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ObjectEventTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testObjectEvent() {
        ObjectEvent event = new ObjectEvent("contain data");

        context.publishEvent(event);
    }
}