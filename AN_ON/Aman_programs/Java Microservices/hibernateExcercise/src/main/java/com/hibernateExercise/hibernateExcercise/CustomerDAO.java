package com.hibernateExercise.hibernateExcercise;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDAO implements ICustomer {

		public void addCustomer(Customer obj) {
			try {
				Session session=HibernateUtils.getSessionFactory().openSession();
				Transaction tx=session.beginTransaction();
				session.save(obj);
				tx.commit();	
				session.close();
			}catch(HibernateException e) {
				System.out.println("CustomerDao exception "+e);
			}finally {
				HibernateUtils.getSessionFactory().close();
			}
			
			
		}
		public void readCustomer(int custId) {
			try {
				Session session=HibernateUtils.getSessionFactory().openSession();
				Customer cust=(Customer)session.get(Customer.class, custId);
				System.out.println("Name "+cust.getCustomerName());
				session.close();
				session.flush();
				
			}catch(HibernateException e) {
				System.out.println(e);
			}finally {
				HibernateUtils.getSessionFactory().close();
			}
		}
		
		public void updateCustomer(int custId,String name) {
			try {
				Session session=HibernateUtils.getSessionFactory().openSession();
				Transaction tx=session.beginTransaction();
				Customer entity=(Customer)session.get(Customer.class, custId);
				entity.setCustomerName(name);
				session.update(entity);
				tx.commit();
				session.close();
				
				
			}catch(HibernateException e) {
				System.out.println(e);
			}finally {
				HibernateUtils.getSessionFactory().close();
			}
			
		}
		
		public void updateAddress(int custId,String address) {
			try {
				Session session=HibernateUtils.getSessionFactory().openSession();
				Transaction tx=session.beginTransaction();
				Customer entity=(Customer)session.get(Customer.class, custId);
				entity.setAddress(address);
				session.saveOrUpdate(entity);
				tx.commit();
				session.close();
				session.flush();
				
			}catch(HibernateException e) {
				System.out.println(e);
			}finally {
				HibernateUtils.getSessionFactory().close();
				
			}
		}
		public void deleteCustomer(int custId) {
			try {
				Session session=HibernateUtils.getSessionFactory().openSession();
				Transaction tx=session.beginTransaction();
				
				Customer entity=(Customer)session.get(Customer.class, custId);
				
				session.delete(entity);
				tx.commit();
				session.close();
				
			}catch(HibernateException e) {
				System.out.println(e);
			}
		}
}

