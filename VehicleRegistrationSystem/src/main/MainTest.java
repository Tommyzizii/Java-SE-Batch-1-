package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dao.RentalDao;
import dao.VehicleDao;
import model.Vehicle;
import service.CarRegisterService;
import service.MotorCycleRegisterService;
import service.RentalService;
import service.TruckRegisterService;
import service.VehicleRegistrationService;

public class MainTest {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static VehicleRegistrationService service = null;
	static RentalService rentalService = new RentalService();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		getVehicleInfo();
		System.out.println();
		displayInfo();
		
		getRentalInfo();
		System.out.println();
		displayRentalInfo();
	}
	
	public static void getVehicleInfo() throws IOException {
		String flag;
		do {
			System.out.print("Enter the type of the vehicle(Car/ Truck/ Motorcycle): ");
			String type = br.readLine();
			
			if (type.equalsIgnoreCase("Car")) {
				service = new CarRegisterService();
			}
			else if(type.equalsIgnoreCase("Truck")){
				service = new TruckRegisterService();
			}
			else if (type.equalsIgnoreCase("Motorcycle")) {
				service = new MotorCycleRegisterService();
			}
			
			service.register();
			
			System.out.print("Say \"Yes\" if you want to add more/ or \"No\" : " );
			flag = br.readLine();
			System.out.println();
			
		}while(flag.equalsIgnoreCase("Yes"));
		
	}
	
	public static void getRentalInfo() throws IOException {
		String flag;
		do{
			rentalService.call();
			System.out.print("Do you want to add new rental informations: ");
			flag = br.readLine();
			System.out.println();
		}while(flag.equalsIgnoreCase("Yes"));	
	}
	
	public static void displayRentalInfo() {
		for (int i = 0; i < RentalDao.getCount(); i ++) {
			System.out.println(RentalDao.getAll()[i]);
			System.out.println();
		}
	}

	public static void displayInfo() {
	    int count = 1;
	    for (Vehicle vehicle : VehicleDao.getAll()) {
	        if (vehicle != null) {  // Check if the vehicle is not null
	            System.out.println("No" + count + ":");
	            vehicle.displayInfo();
	            System.out.println();
	            count++;  // Increment the count for the next vehicle
	        }
	    }
	}
	
}
