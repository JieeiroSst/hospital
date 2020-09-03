package com.hospital.service.Nurse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.model.Nurse;
import com.hospital.repo.NurseRepository;

@Service
@Transactional
public class ServiceImpl implements NurseService{
    @Autowired
    private NurseRepository repo;

    @Override
    public List<Nurse> getList(){
        return (List<Nurse>) repo.findAll();
    }
    @Override
    public Nurse getNurse(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Nurse nurse){
        repo.save(nurse);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
