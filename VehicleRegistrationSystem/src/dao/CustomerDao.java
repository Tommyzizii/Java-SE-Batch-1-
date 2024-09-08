package dao;

import model.Customer;

public class CustomerDao {
	private static Customer[] customerDB = new Customer[Customer.MAX_CUSTOMER_COUNT];
	private static int count = 0;
	
	static {
		System.out.println("---------Static block----------");
		create(new Customer(1, "Mya Mya", "Yangon"));
		create(new Customer(2, "Mg Zaw", "Dawei"));
		create(new Customer(3, "Ni Ni", "Thailand"));
		create(new Customer(4, "U Win", "Bagan"));
		create(new Customer(5, "Shwe", "TaungGyi"));
		
	}
	
	public static void create(Customer customer) {
		customerDB[count] = customer;
		count++;
		
 	}
	
	public static Customer findByName(String name) {	
		for(int i = 0; i < count; i++) {
			if (customerDB[i].equalsName(name)) {
				return customerDB[i];
			}
		}
		return null;
	}


}
