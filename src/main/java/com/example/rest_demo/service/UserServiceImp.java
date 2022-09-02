package com.example.rest_demo.service;

import com.example.rest_demo.model.User;
import com.example.rest_demo.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    UserRepo userRepo;

    public UserServiceImp(UserRepo userRepo){

        this.userRepo = userRepo;

    }

    @Override
    public String createUser(User user){
        userRepo.save(user);
        return "done";
    }
}
