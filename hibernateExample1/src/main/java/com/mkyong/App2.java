package com.mkyong;

import java.util.Date;

import org.hibernate.Session;

import com.mkyong.admin.DBAdmin;
import com.mkyong.util.HibernateUtil;

public class App2 {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		/*
		 * SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 * Session session=sf.openSession();
		 */
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		DBAdmin admin = new DBAdmin();

		
		admin.setAdminName("superman2");
		admin.setLastUpdated(new Date());

		session.save(admin);
		session.getTransaction().commit();
	}
}
