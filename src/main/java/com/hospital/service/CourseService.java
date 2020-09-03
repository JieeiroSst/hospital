package com.hospital.service;

import com.hospital.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourse();
    Course getCourseById(int id);
    void saveCourse(Course course);
    void deleteCourse(int id);
}
