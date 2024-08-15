package com.chunchun21.KF.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private int address_id;
    private String type;
    private String phone;
    private String address_detail;
    private boolean verify;
    private boolean isDelete;


}
