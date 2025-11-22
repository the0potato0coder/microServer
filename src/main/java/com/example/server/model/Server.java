package com.example.server.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "servers") // This tells Mongo to create a collection named 'servers'
public class Server {

    @Id // This marks the primary key. MongoDB will auto-generate this.
    private String id;

    private int transactionId;
    private String name;
    private String email;

    private long phoneNo;

    // --- Constructors ---
    public Server() {}

    public Server(int transactionId, String name, String email, long phoneNo) {
        this.transactionId = transactionId;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int transactionId) { this.transactionId = transactionId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public long getPhoneNo() { return phoneNo; }
    public void setPhoneNo(long phoneNo) { this.phoneNo = phoneNo; }
}