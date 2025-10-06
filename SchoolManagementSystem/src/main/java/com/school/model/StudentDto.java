package com.school.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDto {
		private Long id;
	    private String studentName;
	    private String fatherName;
	    private String motherName;
	    private String gender;
	    private Long aadharNumber;
	    private LocalDate dateOfBirth;
	    private String board;
}
