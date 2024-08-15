package com.chunchun21.KF.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Entity
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class User {
    
    @Id
    @GeneratedValue( strategy = GenerationType.UUID)
     String user_id;   
     String username;
     String firstName;
     String lastName;
     boolean sex;
     String email;
     String birthDate;
     String bio;
     String address;
     boolean isDelete;


    public User(String username, String firstName, String lastName, boolean sex, String email, String birthDate, String bio, String address) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.email = email;
        this.birthDate = birthDate;
        this.bio = bio;
        this.address = address;
     
    }





}
