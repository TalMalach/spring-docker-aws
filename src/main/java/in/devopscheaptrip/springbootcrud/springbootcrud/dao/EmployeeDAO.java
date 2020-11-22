package in.devopscheaptrip.springbootcrud.springbootcrud.dao;

import java.util.List;

import in.devopscheaptrip.springbootcrud.springbootcrud.model.Employee;

/*
 * 
 * Data Access Object Pattern or DAO pattern is used to separate 
 * low level data accessing API or operations
 *  from high level business services
 */
public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id); 
}
