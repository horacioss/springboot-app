package com.horacioss.cppmsaelectronic.repository;

import com.horacioss.cppmsaelectronic.entity.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductModelRepository extends JpaRepository<ProductModel, Void>, JpaSpecificationExecutor<ProductModel> {

}