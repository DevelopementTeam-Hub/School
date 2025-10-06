package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.AttendanceDto;
import com.school.service.IAttendanceService;


@RestController
@RequestMapping("/attendance")
public class AttendanceController {

	@Autowired IAttendanceService attendanceService;
	
	@PostMapping("/{sid}/record")
	public ResponseEntity<AttendanceDto> enterStudentAttendanceByRollNumber(
			@PathVariable(name="sid")Long id,@RequestBody AttendanceDto attendanceDto) {
		return new ResponseEntity<>(attendanceService.markAttendanceByStudentId(id, attendanceDto),HttpStatus.CREATED);
	}
	
}
