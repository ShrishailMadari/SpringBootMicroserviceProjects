package com.shyloostyle.userservice.service.impl;

import com.shyloostyle.userservice.exception.ResourceNotFoundException;
import com.shyloostyle.userservice.model.Customer;
import com.shyloostyle.userservice.repository.CustomerRepository;
import com.shyloostyle.userservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer createCustomer(Customer customer) {
        //generate unique string id
        String stringId = UUID.randomUUID().toString();
        customer.setId(stringId);
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(String id) {
            return customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("no customer for The " + id));
    }

    @Override
    public Customer updateCustomer() {
        return null;
    }
}
