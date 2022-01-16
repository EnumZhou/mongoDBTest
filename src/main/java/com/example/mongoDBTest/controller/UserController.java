package com.example.mongoDBTest.controller;

import com.example.mongoDBTest.entity.User;
import com.example.mongoDBTest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/find/{name}")
    public User findUser(@PathVariable String name) {
        User user= userRepository.findUserByName(name)
                .orElse(null);
        return user;
    }

}
