package com.employeemgmt.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemgmt.employeeservice.model.EmployeeEntity;
import com.employeemgmt.employeeservice.repository.EmployeeRepo;

@Service

public class EmployeeService {
	
	@Autowired
	private EmployeeRepo emprepo;

	public EmployeeEntity saveEmployee(EmployeeEntity emp) {
		// TODO Auto-generated method stub
		return emprepo.save(emp);
		
	}

	public List<EmployeeEntity> getEmployee() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	public EmployeeEntity updateEmployee(EmployeeEntity emp, Long id) {
		EmployeeEntity e=emprepo.findById(id).get();
		e.setEmail(emp.getEmail());
		e.setfName(emp.getfName());
		e.setlName(emp.getlName());
		e.setMobile(emp.getMobile());
		
		
		return emprepo.save(e);
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		emprepo.deleteById(id);
		
	}

}
