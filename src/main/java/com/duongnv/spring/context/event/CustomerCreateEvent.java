package com.duongnv.spring.context.event;

import com.duongnv.spring.context.customer.Customer;

public class CustomerCreateEvent extends CustomerEvent {
    
    public CustomerCreateEvent(Customer customer) {
        super(customer);
    }
}
