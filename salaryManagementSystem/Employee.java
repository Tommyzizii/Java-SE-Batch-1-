package salaryManagementSystem;

public class Employee {
	
	private String names;
	private int employeeID;
	private double basicSalary;
	
	public Employee(String names, int employeeInt, double basicSalary) {
		super();
		this.names = names;
		this.employeeID= employeeInt;
		this.basicSalary = basicSalary;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}


	public double calculateSalary() {
		return this.basicSalary;
	}
	
	public void displayDetails() {
		System.out.println("Employee names: " + names);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Basic Salary: " + this.calculateSalary());
	}
	
	

}
