package com.duongnv.spring.context.event;

import com.duongnv.spring.context.customer.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerCreateEventTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testCustomerCreatedEvent() throws InterruptedException {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("name");
        CustomerCreateEvent event = new CustomerCreateEvent(customer);
        context.publishEvent(event);
        TimeUnit.SECONDS.sleep(5);
    }

}