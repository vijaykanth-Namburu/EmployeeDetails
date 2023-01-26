package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();

	@Override
	public List<Employee> findAll() {
		
		
		return employees;
	}

	@Override
	public List<Employee> insert(Employee employee) {
		delete(employee.getEid());
		employees.add(employee);
		return employees;
	}

	@Override
	public Employee update(Employee employee) {
		for(Employee emp:employees)
		{
			if(emp.getEid() == employee.getEid())
				employees.set(employees.indexOf(emp),employee);
			
		}

		return employee;
	}

	@Override
	public List<Employee> delete(int id) {
		employees.removeIf(e->e.getEid()==id);

		return employees;
	}

	@Override
	public List<Employee> addEmployees(List<Employee> employee) {
		employees.addAll(employee);

		return employees;
	}

	@Override
	public Employee findById(int id) {
		for(Employee emp:employees)
		{
			if(emp.getEid() == id)
				return emp;
		
		}
		return null;
	

}
}
