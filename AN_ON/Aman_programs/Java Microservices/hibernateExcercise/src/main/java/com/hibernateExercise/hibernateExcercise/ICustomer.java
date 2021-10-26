package com.hibernateExercise.hibernateExcercise;

public interface ICustomer {
	
	public void addCustomer(Customer custObj);
	public void readCustomer(int id);
	public void updateCustomer(int id,String name);
	public void updateAddress(int id,String address);
	public void deleteCustomer(int custId);
}
