package com.duongnv.spring.context.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//@Component
@Slf4j
public class CustomerEventHandler {

    @EventListener
    public void handle(CustomerCreateEvent event) {
        log.info("handler: {}", event);
    }


    @EventListener
    public CustomerUpdateResultEvent handle(CustomerUpdateEvent event) {
        log.info("handle update: {}", event);
        return new CustomerUpdateResultEvent(event.getCustomer());
    }

    @EventListener
    public void handle(CustomerUpdateResultEvent event) {
        log.info("handle update resutl: {}", event);
    }


}
