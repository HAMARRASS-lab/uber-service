package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Course;

public interface CourseService {

	public List <Course> findAll();
	
	public Optional <Course> findById( int idCourse);
	
	public void  save(Course theCourse);
	
	public void deleteById( int idCourse);
}
