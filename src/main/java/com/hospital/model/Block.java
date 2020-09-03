package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int BlockFloor;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int BlockCode;

    public Block(){}

    public int getBlockFloor() {
        return BlockFloor;
    }

    public int getBlockCode() {
        return BlockCode;
    }

    public void setBlockFloor(int blockFloor) {
        BlockFloor = blockFloor;
    }

    public void setBlockCode(int blockCode) {
        BlockCode = blockCode;
    }
}
