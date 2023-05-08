package com.company.checkout;

import com.company.Customer;

public interface CheckoutService {

    boolean boolean checkout(Customer customer, Double totalAmount);
}
