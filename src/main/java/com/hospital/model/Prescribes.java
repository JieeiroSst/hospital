package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Prescribes {
    @Id
    private int Physician;
    @Id
    private int Patient;
    @Id
    private int Medication;
    private Date Date;
    private int Appointment;
    private String Dose;

    public Prescribes(){}

    public int getPatient() {
        return Patient;
    }

    public int getPhysician() {
        return Physician;
    }

    public String getDose() {
        return Dose;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public int getAppointment() {
        return Appointment;
    }

    public int getMedication() {
        return Medication;
    }

    public void setPatient(int patient) {
        Patient = patient;
    }

    public void setPhysician(int physician) {
        Physician = physician;
    }

    public void setMedication(int medication) {
        Medication = medication;
    }

    public void setDose(String dose) {
        Dose = dose;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public void setAppointment(int appointment) {
        Appointment = appointment;
    }
}
