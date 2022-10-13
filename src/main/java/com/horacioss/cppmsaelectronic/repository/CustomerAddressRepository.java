package com.horacioss.cppmsaelectronic.repository;

import com.horacioss.cppmsaelectronic.entity.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Void>, JpaSpecificationExecutor<CustomerAddress> {

}