package service;

import java.io.IOException;

import model.Car;
import model.Vehicle;

public class CarRegisterService extends VehicleRegistrationService {
	
	
	
	@Override
	public Vehicle getSpecificInfo() throws IOException {
		System.out.print("Enter Numbers of Doors: ");
		int doors = Integer.parseInt(br.readLine()) ;
		
		Car car = new Car(super.getBrandName(), super.getModel(), doors, super.getPrice());	
		return car;
	}

	
}
