package com.mum.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.domain.Department;
import com.mum.domain.Employee;
import com.mum.repository.EmployeeRepository;
import com.mum.repository.HolidaysRepository;
import com.mum.services.EmployeeService;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee> getAll() {
		System.out.println("inside repository call for employee getall()");
		return (List<Employee>)employeeRepository.findAll();
	}

	public Employee getOneByPRimaryId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int save(Employee entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean delete(Employee entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
