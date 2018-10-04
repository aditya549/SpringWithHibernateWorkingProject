package com.java.spring;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class EmpDaoImpl implements EmpDao {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insert(Employee e) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
		session.close();
		System.out.println("Successfully Inserted");
		
	}

	@Override
	public void update(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> fetch() {
		// TODO Auto-generated method stub
		return null;
	}

}
