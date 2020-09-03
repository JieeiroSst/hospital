package com.hospital.service.Prescribes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.model.Prescribes;
import com.hospital.repo.PrescribesRepository;

@Service
@Transactional
public class ServiceImpl implements PrescribesService{
    @Autowired
    private PrescribesRepository repo;

    @Override
    public List<Prescribes> getList(){
        return (List<Prescribes>) repo.findAll();
    }
    @Override
    public Prescribes getPrescribes(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Prescribes prescribes){
        repo.save(prescribes);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
