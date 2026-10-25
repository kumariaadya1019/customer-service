package com.enterprise.customerservice.controller;

import com.enterprise.customerservice.dto.CustomerDto;
import com.enterprise.customerservice.facde.CustomerFacde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class Customercontroller {
     @Autowired
    private CustomerFacde customerFacde;
     @PostMapping("/create-customers")
    public ResponseEntity<CustomerDto> createCustomers(@RequestBody CustomerDto customerDto){
        return ResponseEntity.ok(customerFacde.createCustomer(customerDto));
    }
     @GetMapping("/getCustomers")
    public ResponseEntity<List<CustomerDto>> getAllCustomer(){
        return ResponseEntity.ok(customerFacde.getCustomers());
    }
}
