package com.example.server.repository;

import com.example.server.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepository extends MongoRepository<Server, String> {
    // You can add custom lookups here effortlessly:
    // Server findByTransactionId(int transactionId);
}