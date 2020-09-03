package com.hospital.repo;

import com.hospital.model.Physician;
import org.springframework.data.repository.CrudRepository;

public interface PhysicianReopsitory extends CrudRepository<Physician,Integer> {
}
