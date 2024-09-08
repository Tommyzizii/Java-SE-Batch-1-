package service;

import java.io.IOException;

import model.Truck;
import model.Vehicle;

public class TruckRegisterService extends VehicleRegistrationService{

	@Override
	public Vehicle getSpecificInfo() throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter the play load capacity of the truck: ");
		int playLoadCapacity = Integer.parseInt(br.readLine());
		
		Truck truck = new Truck(super.getBrandName(), super.getModel(), playLoadCapacity, super.getPrice());
		return truck;
	}
	

}
