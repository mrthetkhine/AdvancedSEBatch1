package cleancode.exception.notnull;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
	Optional<Employee> getEmployeeById(long employeeId);
	List<Employee> getAllEmployee();
}
