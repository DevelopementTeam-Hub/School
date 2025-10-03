package com.school.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="location_tab")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="loc_seq")
    @SequenceGenerator(name="loc_seq", initialValue = 1, allocationSize = 1)
    @Column(name="loc_id_col")
    private Long id;

    @Column(name="loc_state_col", length=50)
    private String state;

    @Column(name="loc_district_col", length=50)
    private String district;

    @Column(name="loc_branchType_col", length=50)
    private String branchType; // dayScholar

    @Column(name="loc_campus_col", length=50)
    private String campusType; // co-Education

    @Column(name="loc_branch_col", length=50)
    private String branch;

    @Column(name="loc_class_col", length=20)
    private String standard;

    @OneToMany(mappedBy = "location")
    private List<Student> students;
}
