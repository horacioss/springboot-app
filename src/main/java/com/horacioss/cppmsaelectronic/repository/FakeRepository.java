package com.horacioss.cppmsaelectronic.repository;

import com.horacioss.cppmsaelectronic.entity.FakeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FakeRepository extends JpaRepository<FakeEntity, Long>, JpaSpecificationExecutor<FakeEntity> {
}
