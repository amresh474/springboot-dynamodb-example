/**
 * 
 */
package dynamodb.example.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.amazonaws.AmazonServiceException;

import dynamodb.example.entity.Employee;
import dynamodb.example.repository.EmployeeRepository;
import dynamodb.example.service.EmployeeService;

/**
 * @author amreshkumar
 *
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee result = null;
		try {
			result = employeeRepository.save(employee);
			System.out.println(result);
		} catch (AmazonServiceException e) {
			logger.error("", e.getStackTrace());
			throw new ResponseStatusException(HttpStatus.valueOf(e.getStatusCode()), e.getMessage(), e);
		}
		return result;
	}

	@Override
	public Employee getEmployeeById(String employeeId) {
		return employeeRepository.getEmployeeById(employeeId);
	}

	@Override
	public String deleteEmployee(String employeeId) {
		return employeeRepository.delete(employeeId);
	}

	@Override
	public String updateEmployee(String employeeId, Employee employee) {
		return employeeRepository.update(employeeId, employee);
	}

}
