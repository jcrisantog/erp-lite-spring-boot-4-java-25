package com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document.embedded;

/** Technical specifications embedded in a product document. */
public record ProductSpecifications(
        String processor,
        String ram,
        String storage,
        String display,
        String weight
) {
}
