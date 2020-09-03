package com.hospital.service.Physician;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.repo.PhysicianReopsitory;
import com.hospital.model.Physician;

@Service
@Transactional
public class Serviceimpl implements PhysicianService{
    @Autowired
    private PhysicianReopsitory repo;

    @Override
    public List<Physician> getList(){
        return (List<Physician>) repo.findAll();
    }
    @Override
    public Physician getPhysican(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Physician physician){
        repo.save(physician);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
