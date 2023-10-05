package com.springboot_practice.restfulwebservice.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    UserRepo userRepo;

    @Autowired
    public UserService (UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public User getById(int id){
        Optional<User> optionalUser = userRepo.findById(id);
        return optionalUser.orElse(null);
    }

    public void create(String name, String custom) {
        User newUser = new User();
        newUser.setName(name);
        newUser.setCustom(custom);
        userRepo.save(newUser);
    }

    public List<User> getAll() {
        List<User> users = userRepo.findAll();
        return users;
    }
}
