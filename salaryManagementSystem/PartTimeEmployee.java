package salaryManagementSystem;

public class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String names, int employeeInt, double basicSalary, int hoursWorked, double hourlyRate) {
		super(names, employeeInt, basicSalary);
		// TODO Auto-generated constructor stub
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
}


