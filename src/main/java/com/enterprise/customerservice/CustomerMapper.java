package com.enterprise.customerservice;

import com.enterprise.customerservice.dto.CustomerDto;
import com.enterprise.customerservice.entity.CustomerEnity;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public CustomerDto toDto(CustomerEnity enity){

        CustomerDto dto = new CustomerDto();
        dto.setEmail(enity.getEmail());
        dto.setFullName(enity.getFullName());
        dto.setId(enity.getId());
        dto.setStatus(enity.getStatus());

        return dto;
    }

    public CustomerEnity toEntity (CustomerDto dto){
        CustomerEnity entity = new CustomerEnity();
        entity.setEmail(dto.getEmail());
        entity.setFullName(dto.getFullName());
        entity.setId(dto.getId());
        entity.setStatus(dto.getStatus());

        return entity;
    }
}
