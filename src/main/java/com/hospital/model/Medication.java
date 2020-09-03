package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Code;
    private String Name;
    private String Brand;
    private String Description;

    public Medication(){}

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getBrand() {
        return Brand;
    }

    public int getCode() {
        return Code;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setCode(int code) {
        Code = code;
    }
}
