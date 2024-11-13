package com.shyloostyle.userservice.controller;

import com.shyloostyle.userservice.model.Customer;
import com.shyloostyle.userservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    //create customer
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer cratedCustomer = customerService.createCustomer(customer);
        if (cratedCustomer != null) {
            return new ResponseEntity<>(cratedCustomer, HttpStatus.CREATED);
        }else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    //get CustomerBy id
    //{id} and id given as param should be same
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable String id){
        Customer customerById = customerService.getCustomerById(id);
        if (customerById !=null){
            return new ResponseEntity<>(customerById,HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    //get all customer
    @GetMapping("/allCustomers")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> allCustomer = customerService.getAllCustomer();
        if (allCustomer != null){
            return  new ResponseEntity<>(allCustomer,HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
