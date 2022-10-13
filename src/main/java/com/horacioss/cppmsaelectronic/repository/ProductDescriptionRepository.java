package com.horacioss.cppmsaelectronic.repository;

import com.horacioss.cppmsaelectronic.entity.ProductDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductDescriptionRepository extends JpaRepository<ProductDescription, Void>, JpaSpecificationExecutor<ProductDescription> {

}