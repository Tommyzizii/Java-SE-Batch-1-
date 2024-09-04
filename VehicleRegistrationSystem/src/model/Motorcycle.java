package model;

public class Motorcycle extends Vehicle{
	private boolean hasSideCar;
	
	public Motorcycle(String brand, int model, boolean hasSideCar) {
		super(brand, model);
		this.hasSideCar = hasSideCar;
	}

	@Override
	public void displayInfo() {
		System.out.println("************ Motorcycle ************");
		System.out.println("Brand Name: " + super.getBrand());
		System.out.println("Brand model: " + super.getModel());	
		System.out.println("It has sideCar or not: " + hasSideCar);
	}

}
