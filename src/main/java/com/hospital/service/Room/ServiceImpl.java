package com.hospital.service.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.model.Room;
import com.hospital.repo.RoomRepository;

@Service
@Transactional
public class ServiceImpl implements RoomService{
    @Autowired
    private RoomRepository repo;

    @Override
    public List<Room> getList(){
        return (List<Room>) repo.findAll();
    }
    @Override
    public Room getRoom(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Room room){
        repo.save(room);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
