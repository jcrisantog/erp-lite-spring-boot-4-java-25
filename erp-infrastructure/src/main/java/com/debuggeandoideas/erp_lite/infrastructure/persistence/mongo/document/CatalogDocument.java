package com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document;

import com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document.embedded.CatalogItem;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

/** Maps a document in MongoDB's {@code catalogs} collection. */
@Document(collection = "catalogs")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CatalogDocument {

    @Id
    private String id;

    private boolean active;

    private CatalogType catalogType;

    private Instant createdAt;

    private String description;

    /** Embedded catalog entries, persisted as a MongoDB array rather than a JSON string. */
    private List<CatalogItem> items;

    private String name;

    private Instant updatedAt;
}
