package com.hospital.service.Medication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.repo.MedicationRepository;
import com.hospital.model.Medication;

@Service
@Transactional
public class ServiceImpl implements MedicationService{
    @Autowired
    private MedicationRepository repo;

    @Override
    public List<Medication> getList(){
        return (List<Medication>) repo.findAll();
    }
    @Override
    public Medication getMedication(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Medication medication){
        repo.save(medication);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
