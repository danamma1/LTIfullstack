package com.lt.business;

import com.lt.bean.Customer;

public class CustomerImpl implements CustomerInterface{

	
	Customer customers[] ;
	//Customer customers[] =new Customer[3];
	@Override
	public String createCustomer() {
		customers=new Customer[3];
		System.out.print("****print customer details****");
		
		customers[0] = new Customer();
		customers[0].setCustomerId(101);
		customers[0].setCustomerName("dhana");
		customers[0].setCustomerAddress("hyd");
		
		
		
		customers[1] = new Customer();
		customers[1].setCustomerId(102);
		customers[1].setCustomerName("lakshmi");
		customers[1].setCustomerAddress("pune");
		
		customers[2] = new Customer();
		customers[2].setCustomerId(103);
		customers[2].setCustomerName("rama");
		customers[2].setCustomerAddress("hyd");
		
		
		
		
		
		return "create customer";
		
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		
		
		
		return false;
	}

	@Override
	
	public String listCustomer() {
		// TODO Auto-generated method stub
		
		System.out.println("list customer implemenation");
		
		
		for(Customer cust:customers)
		{
			System.out.println("details of customer" +cust.getCustomerId()+ " " +cust.getCustomerName()+ " " +cust.getCustomerAddress());
		}
		
		
		return "print list customer";
	}
//
	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Inside update method"); 

		
		System.out.println("customer is ::"+customers[2].getCustomerId());
		customers[2].setCustomerName("Ravi");
		System.out.println("Customer Name updated for the 2nd position :: "+customers[2].getCustomerName());

		
		for(Customer cust:customers)
		{
			System.out.println("details of customer" +cust.getCustomerId()+ " " +cust.getCustomerName()+ " " +cust.getCustomerAddress());
		}
		
		
		
		return "update customer";
	}

	
	
}
