package com.example.demo.service;

import com.example.demo.dto.CustomerInfo;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.mapper.AdvanceCustomerMapper;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final AdvanceCustomerMapper advanceCustomerMapper;

    public CustomerService(CustomerRepository customerRepository, AdvanceCustomerMapper advanceCustomerMapper) {
        this.customerRepository = customerRepository;
        this.advanceCustomerMapper = advanceCustomerMapper;
    }

    public CustomerInfo getCustomerInfo(Long id) {
        CustomerInfo dto = new CustomerInfo();
        customerRepository.findById(1L).ifPresent(customerEntity -> {
            dto.setFirstName(customerEntity.getFirstName());
        });

        return null;

    }

    public void updateCustomer(Long id, CustomerInfo request) {
        CustomerEntity entity = customerRepository.findById(id).get();
        advanceCustomerMapper.updateEntity(request, entity);
        customerRepository.save(entity);
    }
}
