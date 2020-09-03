package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int DepartmentID;
    private String Name;
    private int Head;

    public Department(){}

    public String getName() {
        return Name;
    }

    public int getHead() {
        return Head;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setHead(int head) {
        Head = head;
    }

    public void setDepartmentID(int departmentID) {
        DepartmentID = departmentID;
    }
}
