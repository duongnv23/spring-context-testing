package com.duongnv.spring.context.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerEventAsynHandler {

    @EventListener
    @Async
    public void handle(CustomerCreateEvent event) {
        log.info("handler: {}", event);
    }


    @EventListener
    @Async
    public CustomerUpdateResultEvent handle(CustomerUpdateEvent event) {
        log.info("handle update: {}", event);
        return new CustomerUpdateResultEvent(event.getCustomer());
    }

    @EventListener
    @Async
    public void handle(CustomerUpdateResultEvent event) {
        log.info("handle update resutl: {}", event);
    }


}
