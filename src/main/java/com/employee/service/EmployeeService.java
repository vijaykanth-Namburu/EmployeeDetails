package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	
	List<Employee> insert(Employee employee);
	
	Employee update(Employee employee);
	
	List<Employee> delete(int id);

	List<Employee> addEmployees(List<Employee> employee);

	Employee findById(int id);

}
