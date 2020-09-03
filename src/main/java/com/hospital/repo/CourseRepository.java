package com.hospital.repo;

import com.hospital.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Integer> {
}
