package com.enterprise.customerservice.facde;

import com.enterprise.customerservice.CustomerMapper;
import com.enterprise.customerservice.customerservice.Customerservice;
import com.enterprise.customerservice.dto.CustomerDto;
import com.enterprise.customerservice.entity.CustomerEnity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerFacde {
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private Customerservice customerservice;

    public CustomerDto createCustomer(CustomerDto customerDto){
       CustomerEnity entity = customerMapper.toEntity(customerDto);

        CustomerEnity savedEnity = customerservice.createCustomer(entity);

        return customerMapper.toDto(savedEnity);
    }

    public List<CustomerDto> getCustomers(){
        return customerservice.getAllCustomer().stream()
                .map(customerMapper::toDto)
                .collect(Collectors.toList());
    }
}
