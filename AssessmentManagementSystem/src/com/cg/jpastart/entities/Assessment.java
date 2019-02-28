package com.cg.jpastart.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Trainee_Details")
public class Assessment implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	
	private int details_id;
	private String trainee_name;
	private String Module_name;
	private int mpt_marks;
	private int mtt_marks;
	private int assignment_marks;
	
	private int total;
	public void  getsum(int mpt_marks ,int mtt_marks,int assignment_marks)
	{
		
		total=mpt_marks+mtt_marks+assignment_marks;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getDetails_id() {
		return details_id;
	}
	public String getTrainee_name() {
		return trainee_name;
	}
	public String getModule_name() {
		return Module_name;
	}
	public int getMpt_marks() {
		return mpt_marks;
	}
	public int getMtt_marks() {
		return mtt_marks;
	}
	public int getAssignment_marks() {
		return assignment_marks;
	}
	public int getTotal() {
		return total;
	}
	public void setDetails_id(int details_id) {
		this.details_id = details_id;
	}
	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}
	public void setModule_name(String module_name) {
		Module_name = module_name;
	}
	public void setMpt_marks(int mpt_marks) {
		this.mpt_marks = mpt_marks;
	}
	public void setMtt_marks(int mtt_marks) {
		this.mtt_marks = mtt_marks;
	}
	public void setAssignment_marks(int assignment_marks) {
		this.assignment_marks = assignment_marks;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
}
