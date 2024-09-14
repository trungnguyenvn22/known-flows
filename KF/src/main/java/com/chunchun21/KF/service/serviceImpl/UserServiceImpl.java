package com.chunchun21.KF.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chunchun21.KF.dto.request.UserCreationRequest;
import com.chunchun21.KF.entities.User;
import com.chunchun21.KF.repository.UserRepository;
import com.chunchun21.KF.service.UserService;

@Service
public class UserServiceImpl implements UserService{

   @Autowired
   UserRepository userRepository;

    @Override
    public User userCreate(UserCreationRequest userRequest) {
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        userRepository.save(user);
        return user;
    }
    
}
