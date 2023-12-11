package com.gm.VCoJa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    private boolean gender;
    private String phone;
    private String email;
    private String password;

    @OneToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType customerType;


    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;



    @ManyToMany
    @JoinTable(
         name = "user_role",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private List<Role> roles;


}
