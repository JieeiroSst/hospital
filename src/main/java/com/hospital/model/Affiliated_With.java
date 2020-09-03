package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Affiliated_With {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Physician;
    private int Department;
    private int PrimaryAffiliation;

    public Affiliated_With(){}

    public int getPrimaryAffiliation() {
        return PrimaryAffiliation;
    }

    public int getPhysician() {
        return Physician;
    }

    public int getDepartment() {
        return Department;
    }

    public void setPhysician(int physician) {
        Physician = physician;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public void setPrimaryAffiliation(int primaryAffiliation) {
        PrimaryAffiliation = primaryAffiliation;
    }
}
