package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entity.Attendance;

public interface IAttendanceRepository extends JpaRepository<Attendance, Long> {

	
}
