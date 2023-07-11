package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class insertRecord {
	public static void main(String args[]) {
		
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        Session session=factory.openSession();
	        Transaction tx=session.beginTransaction();
	        
	        Employee e=new Employee();
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("enter cid: ");
	        int cid=sc.nextInt();
	        
	        System.out.println("enter cname: ");
	        String cname=sc.next();
	       
	        System.out.println("place: ");
	        String place=sc.next();
	        
	        System.out.println("pan num: ");
	        String pan=sc.next();
	        
	        e.setCid(cid);
	        e.setCname(cname);
	        e.setPlace(place);
	        e.setPan(pan);
	        
	        session.save(e);
	        tx.commit();
	        System.out.println("data inserted");
	        
	        session.close();
	        factory.close();
	}

}
