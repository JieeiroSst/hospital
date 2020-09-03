package com.hospital.service.Undergoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.repo.UndergoesRepository;
import com.hospital.model.Undergoes;

@Service
@Transactional
public class ServiceImpl implements UndergoesService{
    @Autowired
    private UndergoesRepository repo;

    @Override
    public List<Undergoes> getList(){
        return (List<Undergoes>) repo.findAll();
    }
    @Override
    public Undergoes getUndergose(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Undergoes undergoes){
        repo.save(undergoes);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
