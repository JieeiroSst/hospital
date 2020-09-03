package com.hospital.service.Trained_In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.model.Trained_In;
import com.hospital.repo.Trained_InRepository;

@Service
@Transactional
public class ServiceImpl implements Trained_InService{
    @Autowired
    private Trained_InRepository repo;

    @Override
    public List<Trained_In> getList(){
        return (List<Trained_In>) repo.findAll();
    }
    @Override
    public Trained_In getTrained(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Trained_In trained_in){
        repo.save(trained_in);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
