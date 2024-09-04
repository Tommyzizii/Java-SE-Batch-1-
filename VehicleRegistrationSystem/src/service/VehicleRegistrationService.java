package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Car;
import model.Motorcycle;
import model.Truck;
import model.Vehicle;

public class VehicleRegistrationService {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Vehicle[] vehicleList = new Vehicle[100];
			
	public static void getInfo() throws IOException {
		String flag;
		do {
			
			System.out.print("Enter the vehicle you want to register(Car/ Motorcycle/ Truck): ");
			String type = br.readLine();
			if(type.equalsIgnoreCase("Car")) {
				getCarInfo();
				
			}
			else if(type.equalsIgnoreCase("Truck")) {
				getTruckInfo();
				
			}
			else if(type.equalsIgnoreCase("Motorcycle")) {
				getMotorcycleInfo();
				
			}
			System.out.println("Do you want to add more vehiucles(Yes/ or No): ");
			flag = br.readLine();

		}while(flag.equalsIgnoreCase("Yes"));
	}
	
	public static void getCarInfo() throws IOException {
		System.out.print("Enter Brand Name: ");
		String brandName = br.readLine();
		
		System.out.print("Enter the Model: ");
		int model = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Numbers of Doors: ");
		int doors = Integer.parseInt(br.readLine()) ;
		
		Car car = new Car(brandName, model, doors);
		vehicleList[Vehicle.getCount()] = car;
	}
	
	public static void getTruckInfo() throws IOException {
		System.out.print("Enter Brand Name: ");
		String brandName = br.readLine();
		
		System.out.print("Enter the Model: ");
		int model = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the play load capacity of the truck: ");
		int playLoadCapacity = Integer.parseInt(br.readLine());
		
		Truck truck = new Truck(brandName, model, playLoadCapacity);
		vehicleList[Vehicle.getCount()] = truck;
	}

	
	public static void getMotorcycleInfo() throws IOException {
		System.out.print("Enter Brand Name: ");
		String brandName = br.readLine();
		
		System.out.print("Enter the Model: ");
		int model = Integer.parseInt(br.readLine());
		
		System.out.print("Enter \"Yes\" if your Motorcycle has a sidecar or else; \"No\": ");
		String hasSideCar = br.readLine();
		Boolean opt;
		
		if(hasSideCar.equalsIgnoreCase("Yes")) {
			opt = true;
		}
		
		else {
			opt = false;
		}
		
		Motorcycle cycle = new Motorcycle(brandName, model, opt);
		vehicleList[Vehicle.getCount()] = cycle;
		
	}
	
	public static void displayInfo() {
	    int count = 1;
	    for (Vehicle vehicle : VehicleRegistrationService.vehicleList) {
	        if (vehicle != null) {  // Check if the vehicle is not null
	            System.out.println("No" + count + ":");
	            vehicle.displayInfo();
	            System.out.println();
	            count++;  // Increment the count for the next vehicle
	        }
	    }
	}
}
