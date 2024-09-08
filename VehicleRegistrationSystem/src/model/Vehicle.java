package model;

public class Vehicle {
	private int Id;
	private String brand;
	private int model;
	private double rentalPricePerDay = 500;
	private static int count;
	
	public Vehicle(String brand, int model, double rentalPricePerDay) {
		super();
		this.brand = brand;
		this.model = model;
		this.setRentalPricePerDay(rentalPricePerDay);
		count++;
		this.Id = count;
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
	
	public boolean equals(int Id) {
		return this.Id == Id;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public String toString() {
		String str = "Brand: " + this.brand + "\n";
		str += "Model: " +this.model + "\n";
		return str;
	}

	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}

	public void setRentalPricePerDay(double rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}
	
	
	
	

}
