package com.chunchun21.KF.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    
    @Id
    private long user_id;
    private String username;
    private String firstName;
    private String lastName;
    private boolean sex;
    private String email;
    private String birthDate;
    private String bio;
    private String address;
    private boolean isDelete;


}
