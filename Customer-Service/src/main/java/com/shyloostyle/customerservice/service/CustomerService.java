package com.shyloostyle.customerservice.service;

import com.shyloostyle.customerservice.model.Customer;

import java.util.List;

public interface CustomerService {
    //user operations
    Customer createCustomer(Customer customer);

    List<Customer> getAllCustomer();

    Customer getCustomerById(String id);

    Customer updateCustomer();
}
