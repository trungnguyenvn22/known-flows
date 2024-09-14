package com.chunchun21.KF.service;

import com.chunchun21.KF.dto.request.UserCreationRequest;
import com.chunchun21.KF.entities.User;

public interface UserService {
    public User userCreate(UserCreationRequest userRequest);
}
