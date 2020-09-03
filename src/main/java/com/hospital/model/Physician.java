package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Physician {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmployeeID;
    private String Name;
    private String Position;
    private int SSN;

    public Physician(){}

    public int getSSN() {
        return SSN;
    }

    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }
}
