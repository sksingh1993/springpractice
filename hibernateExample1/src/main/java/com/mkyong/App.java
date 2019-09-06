package com.mkyong;

import java.util.Date;

import org.hibernate.Session;

import com.mkyong.user.DBUser;
import com.mkyong.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		/*
		 * SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 * Session session=sf.openSession();
		 */
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		DBUser user = new DBUser();

		user.setUserId(101);
		user.setUsername("superman");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());

		session.save(user);
		session.getTransaction().commit();
	}
}
