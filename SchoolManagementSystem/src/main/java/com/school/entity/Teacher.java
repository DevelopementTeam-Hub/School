/*package com.school.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="teacher_tab")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teach_seq")
	@SequenceGenerator(name="teach_seq", initialValue = 1, allocationSize = 1)
	@Column(name="teach_id_col")
	private Long id;

	@Column(name="teach_name_col")
	private String name;

	@Column(name="teach_subj_col")
	private String subject;

	@Column(name="teach_qulf_col")
	private String qualification;

	@Column(name="teach_phone_col")
	private Long phone;

	@Column(name="teach_loc_col")
	private String location;

	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Student> students;

}
*/