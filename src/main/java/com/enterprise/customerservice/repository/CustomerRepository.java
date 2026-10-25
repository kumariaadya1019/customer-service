package com.enterprise.customerservice.repository;

import com.enterprise.customerservice.entity.CustomerEnity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEnity, Long> {
    Long id(Long id);
}
