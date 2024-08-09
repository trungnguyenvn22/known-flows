package com.chunchun21.KF.entities;

public class Address {
    private int address_id;
    private String type;
    private String phone;
    private String address_detail;
    private boolean verify;
    private boolean isDelete;


    public int getAddress_id() {
        return this.address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress_detail() {
        return this.address_detail;
    }

    public void setAddress_detail(String address_detail) {
        this.address_detail = address_detail;
    }

    public boolean isVerify() {
        return this.verify;
    }

    public boolean getVerify() {
        return this.verify;
    }

    public void setVerify(boolean verify) {
        this.verify = verify;
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

}
