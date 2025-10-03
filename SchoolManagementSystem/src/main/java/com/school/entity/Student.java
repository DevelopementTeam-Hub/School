package com.school.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="student_tab")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stud_seq")
    @SequenceGenerator(name="stud_seq", initialValue = 2025057001, allocationSize = 1)
    @Column(name="stud_id_col")
    private Long id;

    @Column(nullable=false, name="stud_name_col", length=50)
    private String studentName;

    @Column(nullable=false, name="stud_father_name_col", length=50)
    private String fatherName;

    @Column(nullable=false, name="stud_mother_name_col", length=50)
    private String motherName;

    @Column(nullable=false, name="stud_gender_col", length=50)
    private String gender;

    @Column(nullable=false, name="stud_aadharNo_col", length=50, unique = true)
    private String aadharNumber;

    @Column(nullable=false, name="stud_dob_col")
    private LocalDate dateOfBirth;

    @Column(nullable=false, name="stud_board_col", length=50)
    private String board;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Attendance attendance;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Location location;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Parents parents;
}
