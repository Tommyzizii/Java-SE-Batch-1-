package model;

public class Truck extends Vehicle{
	private int playLoadCapacity;
	
	public Truck(String brand, int model, int playLoadCapacity ,double rentalPrice) {
		super(brand, model , rentalPrice);
		this.playLoadCapacity = playLoadCapacity;
	}

	@Override
	public void displayInfo() {
		System.out.println("************ Truck ************");
		System.out.println("Brand Name: " + super.getBrand());
		System.out.println("Brand model: " + super.getModel());	
		System.out.println("Play Loading Capacity: " + playLoadCapacity);
		
	}

	@Override
	public String toString() {
		String str = super.toString();
		str += "Type: Truck \n";
		str += "PlayLoadCapacity: " + this.playLoadCapacity + "\n"; 
		return str;
	}
	
	

}
