package dao;

import model.Vehicle;

public class VehicleDao {
	private static Vehicle[] vehicleDB = new Vehicle[100];
	
	public static void create(Vehicle vehicle) {
		vehicleDB[Vehicle.getCount()-1] = vehicle;
	}
	
	public static Vehicle[] getAll() {
		return vehicleDB;
	}
	
	public static Vehicle findById(int id) {
		for(int i = 0; i < Vehicle.getCount(); i ++) {
			if (vehicleDB[i].equals(id)) {
				return vehicleDB[i];
			}
		}
		return null;
	}
}
