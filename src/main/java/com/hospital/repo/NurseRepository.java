package com.hospital.repo;

import com.hospital.model.Nurse;
import org.springframework.data.repository.CrudRepository;

public interface NurseRepository extends CrudRepository<Nurse,Integer> {
}
