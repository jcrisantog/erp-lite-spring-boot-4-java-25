package com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document.embedded;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
import java.util.List;

/** Optional display and workflow metadata embedded in a catalog item. */
public record CatalogItemMetadata(
        String icon,
        String color,
        List<String> nextStatuses,
        @Field(targetType = FieldType.DECIMAL128) BigDecimal fee
) {
}
