package com.cg.jpastart.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentid;
	private String name;
	public int getStudentId() {
		return studentid;
	}
	public void setStudentId(int studentId) {
		this.studentid = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
