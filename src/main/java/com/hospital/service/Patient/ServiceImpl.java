package com.hospital.service.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.model.Patient;
import com.hospital.repo.PatientRepository;

@Service
@Transactional
public class ServiceImpl implements PatientService{
    @Autowired
    private PatientRepository repo;

    @Override
    public List<Patient> getList(){
        return (List<Patient>) repo.findAll();
    }
    @Override
    public Patient getPatient(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Patient patient){
        repo.save(patient);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
