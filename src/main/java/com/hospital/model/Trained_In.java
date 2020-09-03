package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Trained_In {
    @Id
    private int Physician;
    @Id
    private int Treatment;
    private Date CertificationDate;
    private Date CertificationExpires;

    public Trained_In(){}

    public int getPhysician() {
        return Physician;
    }

    public Date getCertificationExpires() {
        return CertificationExpires;
    }

    public Date getCertificationDate() {
        return CertificationDate;
    }

    public int getTreatment() {
        return Treatment;
    }

    public void setPhysician(int physician) {
        Physician = physician;
    }

    public void setCertificationExpires(Date certificationExpires) {
        CertificationExpires = certificationExpires;
    }

    public void setCertificationDate(Date certificationDate) {
        CertificationDate = certificationDate;
    }

    public void setTreatment(int treatment) {
        Treatment = treatment;
    }
}
