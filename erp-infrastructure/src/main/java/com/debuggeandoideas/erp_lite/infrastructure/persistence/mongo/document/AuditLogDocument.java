package com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

/** Maps a document in MongoDB's {@code audit_logs} collection. */
@Document(collection = "audit_logs")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AuditLogDocument {

    @Id
    private ObjectId id;

    private String className;

    private String endpoint;

    private String errorMessage;

    private long executionTimeMs;

    private String ipAddress;

    private String methodName;

    private boolean success;

    private Instant timestamp;

    private String userId;
}
