package com.school.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="parent_tab")
public class Parents {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="parent_seq")
    @SequenceGenerator(name="parent_seq", initialValue = 1, allocationSize = 1)
    @Column(name="parent_id_col")
    private Long id;

    @Column(nullable=false, name="father_name_col", length=50)
    private String fatherName;

    @Column(nullable=false, name="mother_name_col", length=50)
    private String motherName;

    @Column(nullable=false, name="village_col", length=50)
    private String village;

    @Column(nullable=false, name="sub_dist_col", length=50)
    private String subDist;

    @Column(nullable=false, name="district_col", length=50)
    private String district;

    @Column(nullable=false, name="state_col", length=50)
    private String state;

    @Column(nullable=false, name="phone_col", length=15)
    private String phone;

    @Column(nullable=false, name="pincode_col", length=10)
    private String pincode;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stud_id_col")
    private Student student;
}
