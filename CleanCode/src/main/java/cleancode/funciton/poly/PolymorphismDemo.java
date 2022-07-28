package cleancode.funciton.poly;

public class PolymorphismDemo {
	
	static int computeSalary(Employee emp)
	{
		int salary = emp.getSalary();
		System.out.println("Salary "+salary);
		return salary;
	}
	public static void main(String[]args)
	{
		Employee emp = new CommissionPayEmployee();
		computeSalary(emp);
	}
}
