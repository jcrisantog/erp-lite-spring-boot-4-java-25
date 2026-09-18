package com.debuggeandoideas.erp_lite;

import com.debuggeandoideas.erp_lite.infrastructure.persistence.jpa.entity.ProductJpaEntity;
import com.debuggeandoideas.erp_lite.infrastructure.persistence.jpa.respositories.ProductJpaRepository;
import com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.document.CatalogDocument;
import com.debuggeandoideas.erp_lite.infrastructure.persistence.mongo.respositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class
ErpLiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpLiteApplication.class, args);
	}

}
