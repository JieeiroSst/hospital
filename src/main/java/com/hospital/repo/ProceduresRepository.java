package com.hospital.repo;

import com.hospital.model.Procedures;
import org.springframework.data.repository.CrudRepository;

public interface ProceduresRepository extends CrudRepository<Procedures,Integer> {
}
