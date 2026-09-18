package com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document.embedded;

/** An embedded entry of a catalog document. */
public record CatalogItem(
        String id,
        String code,
        String value,
        String description,
        int displayOrder,
        CatalogItemMetadata metadata
) {
}
