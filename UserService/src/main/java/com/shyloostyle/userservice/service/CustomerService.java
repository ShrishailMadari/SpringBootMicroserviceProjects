package com.shyloostyle.userservice.service;

import com.shyloostyle.userservice.model.Customer;

import java.util.List;

public interface CustomerService {
    //user operations
    Customer createCustomer(Customer customer);

    List<Customer> getAllCustomer();

    Customer getCustomerById(String id);

    Customer updateCustomer();
}
