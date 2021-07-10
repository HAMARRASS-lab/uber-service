package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hamzetsaa.uberprojectservice.entities.Course;
import com.hamzetsaa.uberprojectservice.repositories.CourseRepository;
import com.hamzetsaa.uberprojectservice.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	// inject course repository
	
	CourseRepository courseRepository;
	
	@Autowired
	public CourseServiceImpl (CourseRepository theCourseRepository) {
		courseRepository = theCourseRepository;
	}
	@Override
	public List<Course> findAll() {
		
		return courseRepository.findAll();
	}

	@Override
	public Optional<Course> findById(int idCourse) {
		
		return courseRepository.findById(idCourse);
	}

	@Override
	public void save(Course theCourse) {
		courseRepository.save(theCourse);
		
	}

	@Override
	public void deleteById(int idCourse) {
		
		courseRepository.deleteById(idCourse);
	}

}
