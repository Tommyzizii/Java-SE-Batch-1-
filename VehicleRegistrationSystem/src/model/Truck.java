package model;

public class Truck extends Vehicle{
	private int playLoadCapacity;
	
	public Truck(String brand, int model, int playLoadCapacity) {
		super(brand, model);
		this.playLoadCapacity = playLoadCapacity;
	}

	@Override
	public void displayInfo() {
		System.out.println("************ Truck ************");
		System.out.println("Brand Name: " + super.getBrand());
		System.out.println("Brand model: " + super.getModel());	
		System.out.println("Play Loading Capacity: " + playLoadCapacity);
		
	}

}
