package com.debuggeandoideas.erp_lite.infrastructure.persistence.jpa.entity;

/**
 * Values accepted by the {@code chk_order_status} constraint in PostgreSQL.
 */
public enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}
