package model;

public class Car extends Vehicle{
	private int doors;

	public Car(String brand, int model, int doors) {
		super(brand, model);
		this.doors = doors;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("************ Car ************");
		System.out.println("Brand Name: " + super.getBrand());
		System.out.println("Brand model: " + super.getModel());	
		System.out.println("Numbers of doors: " + doors);
		
	}

}
