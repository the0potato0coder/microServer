package com.example.server.controller;

import com.example.server.model.Server;
import com.example.server.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @PostMapping("/add")
    public Server addServer(@RequestBody Server server) {
        return serverService.addServer(server);
    }

    @GetMapping("/all")
    public List<Server> getAllServers() {
        return serverService.getAllServers();
    }
}