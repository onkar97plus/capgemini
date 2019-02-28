package com.ram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientStudent {
public static void main(String args[]) {
	Configuration cfg=new Configuration();   //starting hibernate framework
	cfg.configure();     //loading hibernate file
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();   //open session
	Transaction tx=session.beginTransaction();
	Student s1=new Student();
	s1.setSno(91);
	s1.setSname("mama");
	s1.setEmail("mama@gmail.com");
	
	s1.setMobile(777777777);
	session.save(s1);   //info not stored into database
	
	tx.commit();   //values will be inserted into database
	session.close();
}
}
