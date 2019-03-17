package com.joaorvieira.mongodbspringboot.services;

import com.joaorvieira.mongodbspringboot.domain.User;
import com.joaorvieira.mongodbspringboot.repository.UserRepository;
import com.joaorvieira.mongodbspringboot.services.exception.ObjectUserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> user = repo.findById(id);
        if (user.isPresent()){
            System.out.println("FindById = " + user.get().getName() + " - OK");
            return user.get();
        }
        else{
            throw new ObjectUserNotFoundException("Objeto nao encontrado");
        }
    }

}
