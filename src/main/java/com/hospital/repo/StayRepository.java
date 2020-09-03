package com.hospital.repo;

import com.hospital.model.Stay;
import org.springframework.data.repository.CrudRepository;

public interface StayRepository extends CrudRepository<Stay,Integer> {
}
