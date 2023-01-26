package com.employee.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	
	@GetMapping(value="/findByAll")
 	public List<Employee> getEmployees()
 	{
		
		List<Employee> employees = employeeservice.findAll();
 		return employees;
 	}
	
	@PostMapping(value="/Insert")
	public List<Employee> addEmployee(@RequestBody Employee employee)
	{
		return employeeservice.insert(employee);
	}
	
	@PostMapping(value="/Insert Employeelist")
	public List<Employee> addEmployees(@RequestBody List<Employee> employee)
	{
		return employeeservice.addEmployees(employee);
	}
	
	@PutMapping(value="/update")
	public Employee updateEmployee(@RequestBody Employee employee){
		return employeeservice.update(employee);
		
	}

	@DeleteMapping(value="/deleteById/{id}")
	public List<Employee> deleteEmployee(@PathVariable("id") int id){
		
		return employeeservice.delete(id);
	}
	
	@GetMapping(value="/findById/{id}")
 	public Employee getEmployeeById(@PathVariable("id") int id)
 	{
		
 		return employeeservice.findById(id);
 	}
	
 
}
