package com.greatlearning.collegefest.service;

import java.util.List;

import com.greatlearning.collegefest.model.Student;

public interface StudentService {

	List<Student> findAll();
	
	Student findById(long id);
	
	void saveStudent(Student theStudent);
	
	void deleteById(long theId);
}
