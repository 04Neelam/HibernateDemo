package com.scp.InheritanceDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
	
	public static void main(String[] args) {
	Parent c1= new Child1(11,"parent1",22, "child1");
	Parent c2= new Child2(12,"parent2", 33,"child2");
	Parent p1= new Parent(10,"parent");
	
	Configuration cfg = new Configuration();
	SessionFactory sf = cfg.configure().buildSessionFactory();
	Session s = sf.openSession();
	Transaction tr = s.beginTransaction();
	s.save(c1);
	s.save(c2);
	s.save(p1);
	tr.commit();
	s.close();
	}
	
}
