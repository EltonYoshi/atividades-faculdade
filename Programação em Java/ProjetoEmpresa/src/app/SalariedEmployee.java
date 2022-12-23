package app;

public class SalariedEmployee extends Employee{
	private double weekSalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weekSalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weekSalary = weekSalary;
	}
	
	
}
