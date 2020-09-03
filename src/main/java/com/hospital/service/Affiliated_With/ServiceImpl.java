package com.hospital.service.Affiliated_With;

import com.hospital.model.Affiliated_With;
import com.hospital.repo.Affiliated_WithRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceImpl implements Affiliated_WithService{
    @Autowired
    private Affiliated_WithRepository repo;

    @Override
    public List<Affiliated_With> getAffiliated_With(){
        return (List<Affiliated_With>) repo.findAll();
    }
    @Override
    public Affiliated_With getById(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Affiliated_With affiliated_with){
        repo.save(affiliated_with);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
