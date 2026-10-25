package com.enterprise.customerservice.customerservice;

import java.util.Optional;
import com.enterprise.customerservice.entity.CustomerEnity;
import java.util.*;

public interface Customerservice {
    CustomerEnity createCustomer(CustomerEnity customer);

    List<CustomerEnity> getAllCustomer();

    Optional<CustomerEnity> getCustomerById(Long id);
}
