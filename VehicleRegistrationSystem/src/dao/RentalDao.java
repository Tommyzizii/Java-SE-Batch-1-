package dao;

import model.Rental;

public class RentalDao {
	private static Rental[] rentalDB = new Rental[Rental.MAX_RENTAL_COUNT];
	private static int count = 0;
	
	public static void create(Rental rental) {
		rentalDB[count] = rental;
		count ++;
	}
	
	public static Rental[] getAll() {
		return rentalDB;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		RentalDao.count = count;
	}
	
	
	
	

}
