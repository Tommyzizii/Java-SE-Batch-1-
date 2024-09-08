package model;

public class Rental {
	public static final int MAX_RENTAL_COUNT = 1000;
	private Customer customer;
	private Vehicle vehicle;
	private int rentalDays;
	private double totalPrice;
	
	public Rental(Customer customer, Vehicle vehicle, int days) {
		this.customer = customer;
		this.vehicle = vehicle;
		this.rentalDays = days;
		this.calculateTotalPrice();
	}
	
	public void calculateTotalPrice() {
		this.totalPrice = this.vehicle.getRentalPricePerDay() *  rentalDays;
	}

	@Override
	public String toString() {
		String str = this.customer.toString();
		str += this.vehicle;
		str += "Rental Days: " + this.rentalDays + "\n";
		str += "Total Price" + this.totalPrice;
		
		return str;
	}
	
	
	
	

}
