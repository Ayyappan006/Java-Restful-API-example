package com.java.mongodb.ServerRepository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.mongodb.Server.Server;

public interface ServerRepository extends MongoRepository<Server, String>{
	List<Server> findByNameContaining(String name);

}
