package com.chunchun21.KF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chunchun21.KF.dto.request.UserCreationRequest;
import com.chunchun21.KF.entities.User;
import com.chunchun21.KF.service.UserService;

@RestController
// @CrossOrigin(origins ="http://localhost:8080")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody UserCreationRequest request){

        return userService.creationUser(request);
    }

    
}
