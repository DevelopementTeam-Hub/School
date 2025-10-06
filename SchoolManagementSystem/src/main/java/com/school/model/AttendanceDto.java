package com.school.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AttendanceDto {
	private Long id;
	private String isPresent;
	private LocalDateTime dateAndTime;
}
