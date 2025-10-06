package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.StudentDto;
import com.school.service.IStudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired IStudentService studentService;
	
	@PostMapping("/register")
	public ResponseEntity<StudentDto> registerStudentDetails(@RequestBody StudentDto studentDto) {
		return new ResponseEntity<>(studentService.saveStudentDetails(studentDto),HttpStatus.CREATED);
	}
	
	

}
