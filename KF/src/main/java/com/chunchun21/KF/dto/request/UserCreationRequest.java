package com.chunchun21.KF.dto.request;
import java.util.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
     String username;
     String firstName;
     String lastName;
     boolean sex;
     String email;
     String birthDate;
     String bio;
     String address;
     String password;
     boolean isChangePassword;
     Date lastChangePassword;
}
