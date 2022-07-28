package cleancode.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cleancode.funciton.poly.CommissionPayEmployee;
import cleancode.funciton.poly.Employee;

public class TestDemo {
	  private static final int COMMISSION_SALARY = 20;

	@Test
	  void testCaseOne()
	  {
		 Employee emp = new CommissionPayEmployee();
		 int salary = emp.getSalary();
		 assertEquals(COMMISSION_SALARY, salary);
	  }
}
