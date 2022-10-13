package com.horacioss.cppmsaelectronic.repository;

import com.horacioss.cppmsaelectronic.entity.ProductModelProductDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductModelProductDescriptionRepository extends JpaRepository<ProductModelProductDescription, Void>, JpaSpecificationExecutor<ProductModelProductDescription> {

}