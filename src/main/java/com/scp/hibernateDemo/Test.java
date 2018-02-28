package com.scp.hibernateDemo;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Student st = new Student(33,"neelam","abc");
		Student st1 = new Student(44,"neel","xyz");
		Student st2 = new Student(55,"nee","pqr");
		
		st.setBirthdate(new Date());
		st1.setBirthdate(new Date());
		st2.setBirthdate(new Date());
		Configuration cfg=new Configuration(); 
		SessionFactory sf =cfg.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		s.save(st);
		s.save(st1);
		s.save(st2);
		tr.commit();
		s.close();
		System.out.println("completed");
		
		
	}

}
