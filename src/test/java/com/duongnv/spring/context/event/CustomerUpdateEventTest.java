package com.duongnv.spring.context.event;

import com.duongnv.spring.context.customer.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class CustomerUpdateEventTest {
    @Autowired
    private ApplicationContext context;

    @Test
    void testHandleUpdateEvent() throws InterruptedException {
        Customer customer = new Customer();
        customer.setId(2);
        customer.setName("123234234");
        context.publishEvent(new CustomerUpdateEvent(customer));
        TimeUnit.SECONDS.sleep(5);
    }
}