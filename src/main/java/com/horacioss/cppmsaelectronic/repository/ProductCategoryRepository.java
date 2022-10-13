package com.horacioss.cppmsaelectronic.repository;

import com.horacioss.cppmsaelectronic.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Void>, JpaSpecificationExecutor<ProductCategory> {

}