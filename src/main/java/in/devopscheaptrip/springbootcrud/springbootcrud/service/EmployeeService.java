package in.devopscheaptrip.springbootcrud.springbootcrud.service;


import java.util.List;

import in.devopscheaptrip.springbootcrud.springbootcrud.model.Employee;


public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id); 
}
