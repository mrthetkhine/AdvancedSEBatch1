package cleancode.exception.notnull;

import java.util.Optional;

public class BusinessLogic {
	
	EmployeeService employeeService;
	
	BusinessLogic(EmployeeService employeeService)
	{
		this.employeeService = employeeService;
	}
	
	public void processEmploye(long employeeId)
	{
		Optional<Employee> employee  = this.employeeService.getEmployeeById(employeeId);
		System.out.println("Employee "+employee);
	}
	
	public static void main(String[]args)
	{
		
	}
}
