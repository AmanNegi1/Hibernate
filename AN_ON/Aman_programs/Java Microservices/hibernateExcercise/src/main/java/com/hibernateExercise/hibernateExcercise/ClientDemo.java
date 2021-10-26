package com.hibernateExercise.hibernateExcercise;
import org.hibernate.HibernateException;
public class ClientDemo {

	public static void main(String args[]) {
		CustomerDAO custDao=new CustomerDAO();
		try {
//			Customer cust=new Customer(new Integer(5),"Spring");
//			custDao.addCustomer(cust);
			
			//System.out.println("Reading from Customer");
			//custDao.readCustomer(2);
			//System.out.println("Update Name");
			//custDao.updateCustomer(2, "No One");
			
			
//			System.out.println("Update Address");
//			custDao.updateAddress(1, "Dehradun");
//			custDao.updateAddress(2,"BLR");
			
//			System.out.println("Delete Customer");
//			custDao.deleteCustomer(4);
			
		}catch(HibernateException e) {
			System.out.println("Hibernaet Exception "+e);
		}
	}
}
