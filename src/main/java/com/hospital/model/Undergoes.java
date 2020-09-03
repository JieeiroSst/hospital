package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Undergoes {
    @Id
    private int Patient;
    @Id
    private int Procedures;
    @Id
    private int Stay;
    private Date DateUndergoes;
    private int Physician;
    private int AssistingNurse;

    public Undergoes(){}

    public int getPhysician() {
        return Physician;
    }

    public int getPatient() {
        return Patient;
    }

    public int getAssistingNurse() {
        return AssistingNurse;
    }

    public Date getDateUndergoes() {
        return DateUndergoes;
    }

    public int getProcedures() {
        return Procedures;
    }

    public int getStay() {
        return Stay;
    }

    public void setPhysician(int physician) {
        Physician = physician;
    }

    public void setPatient(int patient) {
        Patient = patient;
    }

    public void setAssistingNurse(int assistingNurse) {
        AssistingNurse = assistingNurse;
    }

    public void setDateUndergoes(Date dateUndergoes) {
        DateUndergoes = dateUndergoes;
    }

    public void setProcedures(int procedures) {
        Procedures = procedures;
    }

    public void setStay(int stay) {
        Stay = stay;
    }
}
