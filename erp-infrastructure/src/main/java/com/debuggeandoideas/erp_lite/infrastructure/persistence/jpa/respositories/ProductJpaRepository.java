package com.debuggeandoideas.erp_lite.infrastructure.persistence.jpa.respositories;

import com.debuggeandoideas.erp_lite.infrastructure.persistence.jpa.entity.ProductJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductJpaRepository extends JpaRepository<ProductJpaEntity, UUID> {
}
