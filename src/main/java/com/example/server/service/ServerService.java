package com.example.server.service;

import com.example.server.model.Server;
import com.example.server.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServerService {

    @Autowired
    private ServerRepository serverRepository;

    // Method to save a server
    public Server addServer(Server server) {
        // You can add business logic here later (e.g., check if email is valid)
        return serverRepository.save(server);
    }

    // Method to get all servers
    public List<Server> getAllServers() {
        return serverRepository.findAll();
    }

    public Server collectTicket(String id) {
        Optional<Server> optionalServer = serverRepository.findById(id);

        if (optionalServer.isPresent()) {
            Server server = optionalServer.get();
            server.setCollected(true); // Update the status
            return serverRepository.save(server); // Save changes to MongoDB
        } else {
            throw new RuntimeException("Ticket/Server not found with id: " + id);
        }
    }

    // Inside ServerService class
    public boolean checkCollectionStatus(String transactionId) {
        Server server = serverRepository.findByTransactionId(transactionId);
        if (server != null) {
            return server.isCollected();
        }
        return false;
    }
}