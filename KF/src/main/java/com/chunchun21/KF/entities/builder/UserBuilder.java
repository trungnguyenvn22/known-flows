package com.chunchun21.KF.entities.builder;

import com.chunchun21.KF.entities.User;

public class UserBuilder implements IUser {

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


    public long getUser_id() {
        return this.user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isSex() {
        return this.sex;
    }

    public boolean getSex() {
        return this.sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsDelete() {
        return this.isDelete;
    }

    public boolean getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public UserBuilder addBio(String bio) {
       this.bio = bio;
       return this;
    }

    @Override
    public UserBuilder addBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @Override
    public UserBuilder addEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UserBuilder addFirstName(String firstName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserBuilder addLastName(String lastName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserBuilder addSex(boolean sex) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserBuilder addUserName(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserBuilder adddIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    @Override
    public User build() {
        
        return null;
    }
    
    

    
    
}
