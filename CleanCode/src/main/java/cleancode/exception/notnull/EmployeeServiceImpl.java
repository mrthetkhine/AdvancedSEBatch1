package cleancode.exception.notnull;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService{

	public Optional<Employee> getEmployeeById(long employeeId) {
		if(employeeId == -1)
		{
			return Optional.empty();
		}
		else
		{
			Employee emp = new Employee("Someone",29);
			return Optional.of(emp);
		}
	}

	public List<Employee> getAllEmployee() {
		
		return Collections.emptyList();
	}
	
	public static void main(String args[])
	{
		EmployeeService service = new EmployeeServiceImpl();
		Optional<Employee> employee  = service.getEmployeeById(-1);
		Optional<String> result = (Optional<String>)(employee.flatMap(emp-> Optional.of("Mr" +emp.name)));
		if(result.isPresent())
		{
			System.out.println("Yes employee exist "+result.get());
		}
	}
}
