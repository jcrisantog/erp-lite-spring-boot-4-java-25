package com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.respositories;

import com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document.ProductInCatalogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductInCatalogRepository extends MongoRepository<ProductInCatalogDocument, String> {
}
