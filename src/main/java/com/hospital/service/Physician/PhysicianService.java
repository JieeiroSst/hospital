package com.hospital.service.Physician;

import com.hospital.model.Physician;
import java.util.List;

public interface PhysicianService {
    List<Physician> getList();
    Physician getPhysican(int id);
    void save(Physician physician);
    void delete(int id);
}
