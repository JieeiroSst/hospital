package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int SSN;
    private String Name;
    private String Address;
    private String Phone;
    private int InsuranceID;
    private int PCP;

    public Patient(){}

    public String getName() {
        return Name;
    }

    public int getSSN() {
        return SSN;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }

    public int getInsuranceID() {
        return InsuranceID;
    }

    public int getPCP() {
        return PCP;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setInsuranceID(int insuranceID) {
        InsuranceID = insuranceID;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPCP(int PCP) {
            this.PCP = PCP;
    }
}
