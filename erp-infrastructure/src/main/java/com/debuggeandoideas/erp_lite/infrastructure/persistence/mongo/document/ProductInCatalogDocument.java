package com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document;

import com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document.embedded.ProductSpecifications;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

/** Maps a document in MongoDB's {@code product_documents} collection. */
@Document(collection = "product_documents")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductInCatalogDocument {

    @Id
    private String id;

    private boolean active;

    private String categoryId;

    private String categoryName;

    private Instant createdAt;

    private String currency;

    private String description;

    private String imageUrl;

    private String name;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal price;

    private String sku;

    private ProductSpecifications specifications;

    private int stock;

    private List<String> tags;

    private Instant updatedAt;
}
