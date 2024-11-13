package com.shyloostyle.userservice.repository;

import com.shyloostyle.userservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
