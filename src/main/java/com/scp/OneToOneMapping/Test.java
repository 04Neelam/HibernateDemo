package com.scp.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Vehicle v= new Vehicle(2, "maestro");
		User u= new User(1, "neelam",v);
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		s.save(v);
		s.save(u);
		tr.commit();
		s.close();
		}
		


}
