package com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.respositories;

import com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document.CatalogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CatalogRepository extends MongoRepository<CatalogDocument, UUID> {
}
