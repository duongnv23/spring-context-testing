package com.duongnv.spring.context.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ObjectEventHandler {
    @EventListener
    public void handle(ObjectEvent event) {
        log.info("handle: {}", event);
    }

}
