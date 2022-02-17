package cleancode.funciton.poly;

public class CommissionPayEmployee extends Employee {

	@Override
	int getSalary() {
		System.out.println("CommissionPayEmployee get slary");
		return 20;
	}
	
}
