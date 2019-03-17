package com.joaorvieira.mongodbspringboot.repository;

import com.joaorvieira.mongodbspringboot.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {



}
