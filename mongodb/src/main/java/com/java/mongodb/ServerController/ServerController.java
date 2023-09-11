package com.java.mongodb.ServerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.mongodb.Server.Server;
import com.java.mongodb.ServerRepository.ServerRepository;

@RestController
@RequestMapping("/server")
public class ServerController {
	@Autowired
    private ServerRepository serverRepository;

    @GetMapping
    public List<Server> getAllServers() {
        return serverRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Server> getServerById(@PathVariable String id) {
        return serverRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Server> createServer(@RequestBody Server server) {
        Server savedServer = serverRepository.save(server);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedServer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServer(@PathVariable String id) {
        if (serverRepository.existsById(id)) {
            serverRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/findByName")
    public ResponseEntity<List<Server>> getServersByName(@RequestParam String name) {
        List<Server> servers = serverRepository.findByNameContaining(name);
        if (!servers.isEmpty()) {
            return ResponseEntity.ok(servers);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

