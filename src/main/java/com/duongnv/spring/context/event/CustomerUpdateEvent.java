package com.duongnv.spring.context.event;

import com.duongnv.spring.context.customer.Customer;

public class CustomerUpdateEvent extends CustomerEvent {
    public CustomerUpdateEvent(Customer customer) {
        super(customer);
    }
}
