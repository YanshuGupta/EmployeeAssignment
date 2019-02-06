package com.cg.main;

import com.cg.beans.Address;
import com.cg.beans.City;
import com.cg.beans.Country;
import com.cg.bl.EmployeeService;
import com.cg.bl.EmployeeServiceInterface;
import com.cg.repo.Repository;

public class Main {

	public static void main(String[] args) {
		
		EmployeeServiceInterface service = new EmployeeService(new Repository());
		
		City city = new City();
		city.setName("Pune");
		Country country = new Country();
		country.setName("India");
		country.setCity(city);
		Address address = new Address();
		address.setName("XYZ");
		address.setCountry(country);
		
		System.out.println(service.createEmployee(101, "YANSHU GUPTA", address));
		
		System.out.println(service.createEmployee(105, "YANSHU GUPTA", new Address("LOL", new Country("India", new City("ALIGARH")))));
		System.out.println(service.createEmployee(101, "YATHARTH DUBEY", new Address("ABC", new Country("India", new City("Pune")))));
		System.out.println(service.createEmployee(103, "RAJ KUMAR", new Address("PQR", new Country("China", new City("Beiging")))));
		System.out.println(service.createEmployee(104, "Manas Srivastava", new Address("OMG", new Country("Austrailiya", new City("Sydney")))));
		System.out.println(service.createEmployee(109, null, null));
		System.out.println(""+'\n'+'\n'+'\n');
		
		System.out.println(service.searchByName("YANSHU GUPTA"));
		System.out.println(service.searchByName("YATHARTH DUBEY"));
		System.out.println(service.searchByName("RAJ KUMAR"));
		
	}

}
