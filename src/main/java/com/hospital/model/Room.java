package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int RoomNumber;
    private String RoomType;
    private int BlockFloor;
    private int BlockCode;
    private int Unavailable;

    public Room(){}

    public int getUnavailable() {
        return Unavailable;
    }

    public int getBlockCode() {
        return BlockCode;
    }

    public int getBlockFloor() {
        return BlockFloor;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setBlockCode(int blockCode) {
        BlockCode = blockCode;
    }

    public void setBlockFloor(int blockFloor) {
        BlockFloor = blockFloor;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public void setUnavailable(int unavailable) {
        Unavailable = unavailable;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }
}
