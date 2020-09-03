package com.hospital.service.On_Call;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.repo.On_CallRepository;
import com.hospital.model.On_Call;

@Service
@Transactional
public class ServiceImpl implements On_CallService{
    @Autowired
    private On_CallRepository repo;

    @Override
    public List<On_Call> getList(){
        return (List<On_Call>) repo.findAll();
    }
    @Override
    public On_Call getOn_Call(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(On_Call on_call){
        repo.save(on_call);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
