/*package com.school.entity;

import java.util.List;
import java.util.Random;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="parent_tab")
public class Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="parent_seq")
	@SequenceGenerator(name="parent_seq", initialValue = 1, allocationSize = 1)
	@Column(name="parent_id_col")
	private Long id;

	@Column(name="Par_email_col")
	private String email;

	@Column(name="Par_phoneno_col")
	private Long phoneno;

	@Transient 
	private String otp;

	public void generateOtp() {
		Random random = new Random();
		int number = 100000 + random.nextInt(900000); // 6 digits
		this.otp = String.valueOf(number);
	}

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Student> children;

}
*/