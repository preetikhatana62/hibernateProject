package com.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Students_details")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int stu_rollNo;
	@Column(name="stu_name")
	 private String name;
	 @Column(name="stu_contact" ,unique=true,length=50)
	 private String contact;
	

	

}
