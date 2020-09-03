package com.hospital.service.Stay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.repo.StayRepository;
import com.hospital.model.Stay;

@Service
@Transactional
public class ServiceImpl implements StayService{
    @Autowired
    private StayRepository repo;

    @Override
    public List<Stay> getList(){
        return (List<Stay>) repo.findAll();
    }
    @Override
    public Stay getStay(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Stay stay){
        repo.save(stay);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
