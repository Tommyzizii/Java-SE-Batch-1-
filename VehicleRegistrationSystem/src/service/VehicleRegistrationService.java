package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dao.VehicleDao;
import model.Vehicle;

public class VehicleRegistrationService {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private String brandName;
	private int model;
	private double price;
	
	public void register() throws IOException {
		getCommonInfo();
		Vehicle vehicle = getSpecificInfo();
		VehicleDao.create(vehicle);
	}
			
	public void getCommonInfo() throws IOException {
		System.out.print("Enter Brand Name: ");
		brandName = br.readLine();
		
		System.out.print("Enter the Model: ");
		model = Integer.parseInt(br.readLine());
		
		System.out.print("Enter rental price per day: ");
		setPrice(Double.parseDouble(br.readLine()));
		
	}
	
	public Vehicle getSpecificInfo() throws IOException {
		return null;
		
	}
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
