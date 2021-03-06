package com.rt.microservice.DAO;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rt.microservice.domain.Customer;

public class CustomerDAO {
	Configuration configuration = new Configuration().configure();
	public ArrayList<Customer> customerList(){
		ArrayList<Customer> list = new ArrayList<Customer>();
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Customer.class).
				buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			list = (ArrayList<Customer>)session.createQuery("FROM Customer").list(); 
			transaction.commit();
		}catch (HibernateException e) {
			if (transaction!=null)
				transaction.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		return list;
	}

}
