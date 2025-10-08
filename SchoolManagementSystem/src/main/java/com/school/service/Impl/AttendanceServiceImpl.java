package com.school.service.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entity.Attendance;
import com.school.entity.Student;
import com.school.exception.StudentNotFound;
import com.school.model.AttendanceDto;
import com.school.repository.IAttendanceRepository;
import com.school.repository.IStudentRepository;
import com.school.service.IAttendanceService;

@Service
public class AttendanceServiceImpl implements IAttendanceService {

	@Autowired IAttendanceRepository attendanceRepository;
	
	@Autowired IStudentRepository studentRepository;
	
	@Autowired ModelMapper modelMapper;
	
	@Override
	public AttendanceDto markAttendanceByStudentId(Long sid,AttendanceDto attandanceDto) {
		Student student = studentRepository.findById(sid).orElseThrow(()->new StudentNotFound(String.format("Studnet Id %id Not Found", sid)));
		Attendance attendance = modelMapper.map(attandanceDto,Attendance.class );
		attendance.setStudent(student);
		Attendance savedAttendance =attendanceRepository.save(attendance);
		return modelMapper.map(savedAttendance, AttendanceDto.class) ;
	}

	
}
