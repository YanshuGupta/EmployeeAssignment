package com.cg.bl;

import java.util.List;

import com.cg.beans.Address;
import com.cg.beans.Employee;
import com.cg.repo.Repository;

public class EmployeeService implements EmployeeServiceInterface {

	private Repository repository;
	public EmployeeService(Repository repository) {
		super();
		this.repository = repository;
	}
	
	/* (non-Javadoc)
	 * @see com.cg.bl.EmployeeServiceInterface#createEmployee(int, java.lang.String, com.cg.beans.Address)
	 */
	@Override
	public Employee createEmployee(int id, String name, Address address) {
		
		Employee employee = new Employee(id, name, address);
		
		if(repository.save(employee)) {
			return employee;
		}
		else {		// When Duplicate id is Found
			return null;	
		}
		
	}
	
	/* (non-Javadoc)
	 * @see com.cg.bl.EmployeeServiceInterface#searchByName(java.lang.String)
	 */
	@Override
	public List<Employee> searchByName(String name) {
		
		return repository.findByName(name);
	}

	
}
