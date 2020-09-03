package com.hospital.service.Procedures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.repo.ProceduresRepository;
import com.hospital.model.Procedures;

@Service
@Transactional
public class ServiceImpl implements ProceduresService{
    @Autowired
    private ProceduresRepository repo;

    public List<Procedures> getlist(){
        return (List<Procedures>) repo.findAll();
    }
    public Procedures getProcedures(int id){
        return repo.findById(id).get();
    }
    public void save(Procedures procedures){
        repo.save(procedures);
    }
    public void delete(int id){
        repo.deleteById(id);
    }
}
