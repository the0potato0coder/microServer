package com.example.server.service;

import com.example.server.model.Server;
import com.example.server.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}