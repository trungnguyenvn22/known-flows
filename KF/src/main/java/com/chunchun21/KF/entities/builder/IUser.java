package com.chunchun21.KF.entities.builder;

import com.chunchun21.KF.entities.User;

interface IUser {
    UserBuilder addUserName (String username);

    UserBuilder addFirstName (String firstName);

    UserBuilder addLastName (String lastName);

    UserBuilder addSex (boolean sex);

    UserBuilder addEmail (String email);

    UserBuilder addBirthDate (String birthDate);

    UserBuilder addBio (String bio);

    UserBuilder addAddress(String address);

    User build ();

}
