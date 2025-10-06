package com.school.service.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entity.Student;
import com.school.model.StudentDto;
import com.school.repository.IStudentRepository;
import com.school.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired IStudentRepository studentRepository;
	@Autowired ModelMapper modelMapper;
	
	@Override
	public StudentDto saveStudentDetails(StudentDto studentDto) {
		Student student = modelMapper.map(studentDto,Student.class);
		return modelMapper.map(studentRepository.save(student),StudentDto.class);
	}
	
	
		
	

	
}
