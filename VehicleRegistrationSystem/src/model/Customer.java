package model;

public class Customer {
	public static final int MAX_CUSTOMER_COUNT = 1000;
	private int id;
	private String name;
	private String address;
	
	public Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public boolean equalsName(String name) {
		return this.name.equalsIgnoreCase(name);
	}

	@Override
	public String toString() {
		String str = "Customer Id :" + this.id + "\n";
		str += "Customer Name: " + this.name + "\n";
		str += "Address: " + this.address + "\n";
		return str;
	}
	
	

}
