package com.hospital.service.Room;

import com.hospital.model.Room;
import java.util.List;

public interface RoomService {
    List<Room> getList();
    Room getRoom(int id);
    void save(Room room);
    void delete(int id);
}
