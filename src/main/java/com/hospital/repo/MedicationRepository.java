package com.hospital.repo;

import com.hospital.model.Medication;
import org.springframework.data.repository.CrudRepository;

public interface MedicationRepository extends CrudRepository<Medication,Integer> {
}
