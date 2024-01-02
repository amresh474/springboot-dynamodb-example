/**
 * 
 */
package dynamodb.example.service;

import dynamodb.example.entity.Employee;

/**
 * @author amreshkumar
 *
 */

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public Employee getEmployeeById(String employeeId);

	public String deleteEmployee(String employeeId);

	public String updateEmployee(String employeeId,  Employee employee);

}
