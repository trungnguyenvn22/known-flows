package com.chunchun21.KF.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
    @Id
    private int role_id;
    private String roleName;
    private boolean isDelete;
}
