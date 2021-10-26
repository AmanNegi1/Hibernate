package com.hibernateExercise.hibernateExcercise;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



//import org.hibernate.service.ServiceRegisteryBuilder;
public class HibernateUtils{
	private static Logger logger= Logger.getLogger(HibernateUtils.class);
	private static final SessionFactory sessionFactory;
	static{
		try{
	
			System.out.println( "Project Started" );
	        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	        cfg.addAnnotatedClass(com.hibernateExercise.hibernateExcercise.Customer.class);
	        ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder()
	        		.applySettings(cfg.getProperties())
	        		.build();
	        sessionFactory=cfg.buildSessionFactory(serviceRegistry);
	        System.out.println(sessionFactory+" Factory");
			
	
			

		}
	  catch(Throwable ex){
	    System.err.println("Initial SessionFactory creation failed." +ex);
	    logger.error("Initial SessionFactory creation failed. " + ex);
	    throw new ExceptionInInitializerError(ex);
	  }
	}
		public static SessionFactory getSessionFactory(){
		  return sessionFactory;
		}
}
