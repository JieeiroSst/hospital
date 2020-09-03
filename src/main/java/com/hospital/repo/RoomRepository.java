package com.hospital.repo;

import com.hospital.model.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room,Integer> {
}
