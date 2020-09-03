package com.hospital.service.Department;

import com.hospital.model.Department;
import java.util.List;

public interface DepartmentService {
    List<Department> getList();
    Department getDepartment(int id);
    void save(Department department);
    void delete(int id);
}
