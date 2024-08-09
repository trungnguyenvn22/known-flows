package com.chunchun21.KF.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chunchun21.KF.dto.request.UserCreationRequest;
import com.chunchun21.KF.entities.User;
import com.chunchun21.KF.entities.builder.UserBuilder;
import com.chunchun21.KF.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
 
    public User creationUser (UserCreationRequest request){

        User user = new User();
        user = new UserBuilder()
                .addUserName(request.getUsername())
                .addFirstName(request.getFirstName())
                .addLastName(request.getLastName())
                .addSex(request.getSex())
                .addEmail(request.getEmail())
                .addBirthDate(request.getBirthDate())
                .addBio(request.getBio())
                .addAddress(request.getAddress())
                .build();

        return userRepository.save(user);
    }
    
    
}
