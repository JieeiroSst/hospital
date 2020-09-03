package com.hospital.service.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.model.Department;
import com.hospital.repo.DepartmentRepository;

@Service
@Transactional
public class ServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository repo;

    @Override
    public List<Department> getList(){
        return (List<Department>) repo.findAll();
    }
    @Override
    public Department getDepartment(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Department department){
        repo.save(department);
    }
    @Override
    public void delete(int id){
        repo.deleteById(id);
    }
}
