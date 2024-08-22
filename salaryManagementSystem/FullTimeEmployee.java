package salaryManagementSystem;

public class FullTimeEmployee extends Employee{
	private double allowance;
	private double bonus;

	public FullTimeEmployee(String names, int employeeInt, double basicSalary, double allowance, double bonus) {
		super(names, employeeInt, basicSalary);
		this.allowance = allowance;
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		return this.getBasicSalary() + allowance + bonus;
	}
}
