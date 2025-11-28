package com.example.server.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "servers")
public class Server {

    @Id
    private String id;

    private String transactionId;
    private String name;
    private String email;
    private long phoneNo;

    // New field to track collection status
    private boolean collected = false;

    // --- Constructors ---
    public Server() {}

    public Server(String transactionId, String name, String email, long phoneNo) {
        this.transactionId = transactionId;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.collected = false; // Default to false
    }

//    // --- Getters and Setters ---
//    public String getId() { return id; }
//    public void setId(String id) { this.id = id; }
//
//    public int getTransactionId() { return transactionId; }
//    public void setTransactionId(int transactionId) { this.transactionId = transactionId; }
//
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//
//    public String getEmail() { return email; }
//    public void setEmail(String email) { this.email = email; }
//
//    public long getPhoneNo() { return phoneNo; }
//    public void setPhoneNo(long phoneNo) { this.phoneNo = phoneNo; }
//
//    // New Getter and Setter for collected
//    public boolean isCollected() { return collected; }
//    public void setCollected(boolean collected) { this.collected = collected; }
}