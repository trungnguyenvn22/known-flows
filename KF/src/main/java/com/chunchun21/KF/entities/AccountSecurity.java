package com.chunchun21.KF.entities;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountSecurity {
    
     int id;
     String password;
     Date date_changed;
     boolean is_changed;

}
