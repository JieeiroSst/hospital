package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmployeeID;
    private String Name;
    private String Position;
    private int Registered;
    private int SSN;

    public Nurse(){}

    public int getSSN() {
        return SSN;
    }

    public int getRegistered() {
        return Registered;
    }

    public String getName() {
        return Name;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public String getPosition() {
        return Position;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setRegistered(int registered) {
        Registered = registered;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
}
