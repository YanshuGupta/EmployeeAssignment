package com.cg.bl;

import java.util.List;

import com.cg.beans.Address;
import com.cg.beans.Employee;

public interface EmployeeServiceInterface {

	Employee createEmployee(int id, String name, Address address);

	List<Employee> searchByName(String name);

}