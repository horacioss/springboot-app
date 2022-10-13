package com.horacioss.cppmsaelectronic.repository;

import com.horacioss.cppmsaelectronic.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AddressRepository extends JpaRepository<Address, Void>, JpaSpecificationExecutor<Address> {

}