package cleancode.funciton.poly;

public class PolymorphismDemo {
	
	static void computeSalary(Employee emp)
	{
		int salary = emp.getSalary();
		System.out.println("Salary "+salary);
	}
	public static void main(String[]args)
	{
		Employee emp = new CommissionPayEmployee();
		computeSalary(emp);
	}
}
