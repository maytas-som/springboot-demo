package com.example.demo.service;

import com.example.demo.dto.CustomerInfo;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerInfo getCustomerInfo(Long id) {
        return null;
    }
}
