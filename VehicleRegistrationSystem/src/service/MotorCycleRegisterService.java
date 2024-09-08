package service;

import java.io.IOException;

import model.Motorcycle;
import model.Vehicle;

public class MotorCycleRegisterService extends VehicleRegistrationService{

	@Override
	public Vehicle getSpecificInfo() throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter \"Yes\" if your Motorcycle has a sidecar or else; \"No\": ");
		String hasSideCar = br.readLine();
		Boolean opt;
		
		if(hasSideCar.equalsIgnoreCase("Yes")) {
			opt = true;
		}
		
		else {
			opt = false;
		}
		
		Motorcycle cycle = new Motorcycle(super.getBrandName(), super.getModel(), opt, super.getPrice());
		return cycle;
	}
	
	

}
