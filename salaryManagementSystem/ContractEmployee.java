package salaryManagementSystem;

public class ContractEmployee extends Employee{
	private int contractDuration;
	private double contractAmount;

	public ContractEmployee(String names, int employeeInt, double basicSalary, int contractDuration, double contractAmount) {
		super(names, employeeInt, basicSalary);
		// TODO Auto-generated constructor stub
		this.contractAmount = contractAmount;
		this.contractDuration = contractDuration;
	}
	
	@Override
	public double calculateSalary() {
		return contractAmount / contractDuration;
	}
}
