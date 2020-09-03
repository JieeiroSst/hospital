package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AppointmentID;
    private int Patient;
    private int PrepNurse;
    private int Physician;
    private Date Start;
    private Date End;
    private String ExaminationRoom;

    public Appointment(){}

    public int getPhysician() {
        return Physician;
    }

    public String getExaminationRoom() {
        return ExaminationRoom;
    }

    public int getAppointmentID() {
        return AppointmentID;
    }

    public Date getStart() {
        return Start;
    }

    public Date getEnd() {
        return End;
    }

    public int getPatient() {
        return Patient;
    }

    public int getPrepNurse() {
        return PrepNurse;
    }

    public void setPhysician(int physician) {
        Physician = physician;
    }

    public void setPatient(int patient) {
        Patient = patient;
    }

    public void setStart(Date start) {
        Start = start;
    }

    public void setExaminationRoom(String examinationRoom) {
        ExaminationRoom = examinationRoom;
    }

    public void setEnd(Date end) {
        End = end;
    }

    public void setAppointmentID(int appointmentID) {
        AppointmentID = appointmentID;
    }

    public void setPrepNurse(int prepNurse) {
        PrepNurse = prepNurse;
    }
}
