package com.enterprise.customerservice.serviceimpl;

import com.enterprise.customerservice.customerservice.Customerservice;
import com.enterprise.customerservice.entity.CustomerEnity;
import com.enterprise.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceimpl implements Customerservice {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerEnity createCustomer(CustomerEnity customer){
        return customerRepository.save(customer);
    }

    public List<CustomerEnity>getAllCustomer(){
        return customerRepository.findAll();
    }

    public Optional<CustomerEnity>getCustomerById(Long id){
        return customerRepository.findById(id);
    }
}
