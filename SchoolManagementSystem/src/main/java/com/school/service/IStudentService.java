package com.school.service;

import com.school.entity.Student;
import com.school.model.StudentDto;

public interface IStudentService {
	
	/**
	 * this method reads FORM data as Model class (Student student)
	 * @param s indicates ModelAttribute save(student) method
	 * @return Integer PK generated after save 
	 */
	public StudentDto saveStudentDetails(StudentDto studentDto);
	
	/**
	 * this method is used to fetch the data from database
	 * using findAll() method and 
	 * @return List<Student> back to UI
	 */
//	public List<Student> getAllStudents();

}
