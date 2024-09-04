package model;

public class Vehicle {
	private String brand;
	private int model;
	private static int count;
	
	public Vehicle(String brand, int model) {
		super();
		this.brand = brand;
		this.model = model;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public void displayInfo() {
		System.out.println("Brand name: " + brand);
		System.out.println("Brand model: " + model);
	}

}
