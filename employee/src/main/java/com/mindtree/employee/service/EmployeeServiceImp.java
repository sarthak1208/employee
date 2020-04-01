package com.mindtree.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public List<Employee> listAll() {
		List<Employee> list=empRepo.findAll();
		return list;
	}

	@Override
	public void save(Employee employee) {
		empRepo.save(employee);
		
	}

	@Override
	public Employee get(long id) {
		Employee employee=empRepo.findById(id).get();
	
		return employee;
	}

	@Override
	public void delete(long id) {
		empRepo.deleteById(id);
		
	}

}
