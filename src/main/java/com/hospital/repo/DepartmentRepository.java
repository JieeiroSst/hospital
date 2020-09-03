package com.hospital.repo;

import com.hospital.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Integer> {
}
