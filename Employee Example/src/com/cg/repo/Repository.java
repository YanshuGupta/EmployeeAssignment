package com.cg.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.beans.Employee;

public class Repository {
	
	private Map<Integer, Employee> employees = new HashMap<>();
	
	
	public boolean save(Employee employee) {
		
		if(employees.containsKey(employee.getId())) {
			return false;
		}
		
		employees.put(employee.getId(), employee);
		return true;
	}
	
	
	
	
	
	
	public List<Employee> findByName(String name) {
		
		List<Employee> list = new ArrayList<>();
		
		for(Entry<Integer, Employee> entry: employees.entrySet()) {
			
			if(entry.getValue().getName().equals(name)) {
				list.add(entry.getValue());
			}
		}
		
		return list;
	}
	
	
}
