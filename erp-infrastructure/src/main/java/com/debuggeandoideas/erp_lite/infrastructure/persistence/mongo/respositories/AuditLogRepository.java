package com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.respositories;

import org.bson.types.ObjectId;
import com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document.AuditLogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface AuditLogRepository extends MongoRepository<AuditLogDocument, ObjectId> {
}
