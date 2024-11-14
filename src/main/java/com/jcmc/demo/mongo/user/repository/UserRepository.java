package com.jcmc.demo.mongo.user.repository;

import com.jcmc.demo.mongo.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
