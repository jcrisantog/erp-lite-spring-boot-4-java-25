package com.debuggeandoideas.erp_lite.infrastructure.persistence.jpa.respositories;

import com.debuggeandoideas.erp_lite.infrastructure.persistence.jpa.entity.OrderJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderJpaRepository extends JpaRepository<OrderJpaEntity, UUID> {
}
