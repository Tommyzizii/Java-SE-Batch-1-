package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dao.CustomerDao;
import dao.RentalDao;
import dao.VehicleDao;
import model.Customer;
import model.Rental;
import model.Vehicle;

public class RentalService {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Rental rental;
	
	public void call() throws IOException {
		Customer customer = getCustomerByName();
		Vehicle vehicle = getVehicleById();
		int days = getRentalDays();
		
		rental = new Rental(customer, vehicle, days);
		RentalDao.create(rental);
	}

	private int getRentalDays() throws NumberFormatException, IOException {
		System.out.print("Enter rental days: ");
		int days = Integer.parseInt(br.readLine());
		return days;
		
	}

	private Vehicle getVehicleById() throws NumberFormatException, IOException {
		System.out.print("Enter vehicle ID: ");
		int id = Integer.parseInt(br.readLine());
		Vehicle vehicle = VehicleDao.findById(id);
		
		if (vehicle != null) {
			return vehicle;
		}else {
			System.out.println("Not found Vehicle ID" + id + "***");
			return getVehicleById();
		}
	}

	private Customer getCustomerByName() throws IOException {
		System.out.print("Enter Customer name: ");
		String name = br.readLine();
		Customer customer = CustomerDao.findByName(name);
		
		if (customer != null) {
			return customer;
		}else {
			System.out.println("Not found this customer" + name + "***");
			return getCustomerByName();
		}
	}

}
