package com.chunchun21.KF.entities;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class User {
    
    @Id
    @GeneratedValue( strategy = GenerationType.UUID)
     String user_id;
    @Size(min = 6)
     String username;
     String password;
     String firstName;
     String lastName;
     boolean sex;
     String email;
     String birthDate;
     String bio;
     String address;
     boolean isDelete;
     boolean isChangePassword;
     Date lastChangePassword;


}
