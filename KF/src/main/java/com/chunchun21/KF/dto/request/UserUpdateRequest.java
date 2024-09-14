package com.chunchun21.KF.dto.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {
    
    private String username;
    private String firstName;
    private String lastName;
    private boolean sex;
    private String email;
    private String birthDate;
    private String bio;
    private String address;
    private String password;
    private boolean isChangePassword;
    private Date lastChangePassword;

    
}
