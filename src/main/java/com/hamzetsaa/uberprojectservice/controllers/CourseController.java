package com.hamzetsaa.uberprojectservice.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hamzetsaa.uberprojectservice.entities.Course;
import com.hamzetsaa.uberprojectservice.services.CourseService;

@RestController
@RequestMapping(value="/api")
public class CourseController {
	
	// inject course service 
	CourseService courseServcie;
	@Autowired
	public CourseController(CourseService theCourseServcie) {
		courseServcie = theCourseServcie;
	}

	// create a mapping to explore all course 
	@GetMapping(value ="/courses")
	public  List <Course> getCourse(){
		return courseServcie.findAll();
	}
	
	// crete mapping to expose a course with a primary key 

	@GetMapping(value="/courses/{idCourse}")
	public Optional<Course> getCourse(@PathVariable int  idCourse) {
		
	Optional<Course> theCourse = courseServcie.findById(idCourse);
		
		if(theCourse == null) {
			
			throw new RuntimeException( " the id course is not found "+ theCourse);
		}

	 return theCourse;
	}

	// create a mipping to save a Course 

	@PostMapping("/courses")
	public Course addCourse (@RequestBody Course theCourse) {
		

		courseServcie.save(theCourse);
		
		return theCourse;
	}

	@PutMapping("/courses/{idCourse}")
	public Course updateCourse(@RequestBody Course theCourse) {
		
		courseServcie.save(theCourse);
		
		return theCourse;
	}

	// add mapping to delete an Course

	@DeleteMapping(value ="/courses/{idCourse}")
	public String deleteCourse( @PathVariable int idCourse) {
		
		Optional<Course> theCourse = courseServcie.findById(idCourse);
		
		if (theCourse == null) {
			
			throw new RuntimeException( " the id of course is not found "+ idCourse);
		}
		courseServcie.deleteById(idCourse);
		
		return " the Course was deleted "+ idCourse;
		
	}
}
