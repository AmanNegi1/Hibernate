package com.hibernateExercise.hibernateExcercise;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@Column(name="ID")
	private Integer customerId;
	
	@Column(name="NAME")
	private String customerName;
	
	@Column(name="Address")
	private String address;


	//	@Temporal(TemporalType.DATE)
//	@Column(name="DOB")
//	private Calendar dateOfBirth;
//	@Transient
//	private Integer age;
	public Customer() {
		
	}
	public Customer(Integer id,String name) {
		this.customerId=id;
		this.customerName=name;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
