package com.duongnv.spring.context.event;

import com.duongnv.spring.context.customer.Customer;

public class CustomerUpdateResultEvent extends CustomerEvent {
    public CustomerUpdateResultEvent(Customer customer) {
        super(customer);
    }
}
