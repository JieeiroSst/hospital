package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Stay {
    @Id
    private int StayID;
    private int Patient;
    private int Room;
    private Date StayStart;
    private Date StayEnd;

    public Stay(){}

    public int getPatient() {
        return Patient;
    }

    public Date getStayStart() {
        return StayStart;
    }

    public Date getStayEnd() {
        return StayEnd;
    }

    public int getStayID() {
        return StayID;
    }

    public int getRoom() {
        return Room;
    }

    public void setPatient(int patient) {
        Patient = patient;
    }

    public void setStayStart(Date stayStart) {
        StayStart = stayStart;
    }

    public void setStayEnd(Date stayEnd) {
        StayEnd = stayEnd;
    }

    public void setRoom(int room) {
        Room = room;
    }

    public void setStayID(int stayID) {
        StayID = stayID;
    }
}
