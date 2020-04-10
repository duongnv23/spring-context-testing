package com.duongnv.spring.context.event;

import com.duongnv.spring.context.customer.Customer;
import org.springframework.context.ApplicationEvent;

public abstract class CustomerEvent extends ApplicationEvent {
    public CustomerEvent(Customer customer) {
        super(customer);
    }

    public Customer getCustomer() {
        return (Customer) getSource();
    }
}
