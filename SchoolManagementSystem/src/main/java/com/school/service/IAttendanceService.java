package com.school.service;

import com.school.model.AttendanceDto;

public interface IAttendanceService {

	AttendanceDto markAttendanceByStudentId(Long sid,AttendanceDto attandanceDto);
}
