package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class On_Call {
    @Id
    private int Nurse;
    @Id
    private int BlockFloor;
    @Id
    private int BlockCode;
    @Id
    private Date OnCallStart;
    @Id
    private Date OnCallEnd;

    public On_Call(){}

    public int getBlockCode() {
        return BlockCode;
    }

    public int getBlockFloor() {
        return BlockFloor;
    }

    public Date getOnCallStart() {
        return OnCallStart;
    }

    public Date getOnCallEnd() {
        return OnCallEnd;
    }

    public int getNurse() {
        return Nurse;
    }

    public void setBlockCode(int blockCode) {
        BlockCode = blockCode;
    }

    public void setBlockFloor(int blockFloor) {
        BlockFloor = blockFloor;
    }

    public void setNurse(int nurse) {
        Nurse = nurse;
    }

    public void setOnCallStart(Date onCallStart) {
        OnCallStart = onCallStart;
    }

    public void setOnCallEnd(Date onCallEnd) {
        OnCallEnd = onCallEnd;
    }
}
