package com.debuggeandoideas.erp_lite.infrastructure.persistence.jpa.respositories;

import com.debuggeandoideas.erp_lite.infrastructure.persistence.jpa.entity.OrderProductJpaEntity;
import com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document.CatalogDocument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderProductJpaRepository extends JpaRepository<OrderProductJpaEntity, UUID> {
}
