package com.joaorvieira.mongodbspringboot.config;

import com.joaorvieira.mongodbspringboot.domain.User;
import com.joaorvieira.mongodbspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alesk@gmail.com");
        User joana = new User(null, "Joana Blue", "joaana@gmail.com");

        userRepository.save(maria);
        userRepository.save(alex);
        userRepository.save(joana);
    }
}
