package com.hospital.service.Appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.model.Appointment;
import com.hospital.repo.AppointmentRepository;

@Service
@Transactional
public class ServiceImpl implements AppointmentService{
    @Autowired
    private AppointmentRepository repo;

    @Override
    public List<Appointment> getList(){
        return (List<Appointment>) repo.findAll();
    }
    @Override
    public Appointment getAppointment(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Appointment appointment){
        repo.save(appointment);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
