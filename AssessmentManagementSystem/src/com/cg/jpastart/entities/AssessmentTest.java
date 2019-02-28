package com.cg.jpastart.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AssessmentTest
{

	public static void main(String[] args)
	{
		int a,b,c;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Assessment student = new Assessment();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id to be entered");
		int id=sc.nextInt();
		student.setDetails_id(id);
		System.out.println("enter trainee name to be entered");
		String name=sc.next();
		
		student.setTrainee_name(name);
		System.out.println("enter Modulename to be entered");
		String Modulename=sc.next();
		
		student.setModule_name(Modulename);
		System.out.println("enter mptmarks to be entered");
		int mpt=sc.nextInt();
		
		student.setMpt_marks(mpt);
		System.out.println("enter mttmarks to be entered");
		int mtt=sc.nextInt();
		student.setMtt_marks(mtt);
		System.out.println("enter assignmentmarks to be entered");
		int assignment=sc.nextInt();
		student.setAssignment_marks(assignment);
		a=student.getMpt_marks();
		b=student.getMtt_marks();
		c=student.getAssignment_marks();
		
		student.getsum(a,b,c);
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student to database.");
		em.close();
		factory.close();
	}
}
