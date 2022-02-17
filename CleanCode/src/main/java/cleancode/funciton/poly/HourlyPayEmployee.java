package cleancode.funciton.poly;

public class HourlyPayEmployee extends Employee{

	@Override
	int getSalary() {
		System.out.println("CommissionPayEmployee get slary");
		return 30;
	}

}
