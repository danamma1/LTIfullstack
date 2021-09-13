package com.lt.client;

import com.lt.bean.Customer;
import com.lt.business.CustomerImpl;
import com.lt.business.CustomerInterface;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Customer customer1= new Customer();
	CustomerInterface customer = new CustomerImpl();	
		
			
System.out.println(customer.createCustomer());
//System.out.println(customer.deleteCustomer(110));
System.out.println(customer.listCustomer());
System.out.println(customer.updateCustomer(customer1));
	
	
	}

}
