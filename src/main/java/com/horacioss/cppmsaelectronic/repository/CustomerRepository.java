package com.horacioss.cppmsaelectronic.repository;

import com.horacioss.cppmsaelectronic.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerRepository extends JpaRepository<Customer, Void>, JpaSpecificationExecutor<Customer> {

}