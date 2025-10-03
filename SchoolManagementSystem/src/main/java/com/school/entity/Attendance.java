package com.school.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="attendance_tab")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="attendance_seq")
    @SequenceGenerator(name="attendance_seq", initialValue = 1, allocationSize = 1)
    @Column(name="atten_id_col")
    private Long id;

    @Column(name="atten_present_col")
    private Boolean isPresent;
    
    @Column(name="atten_date_col")
    private LocalDateTime dateAndTime;
    
    @ManyToOne
    private Student student;
    
}
