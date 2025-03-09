package com.employeemgmt.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemgmt.departmentservice.Entity.DepartmentEntity;
import com.employeemgmt.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository deprepo;

	public DepartmentEntity saveDept(DepartmentEntity deptentity) {
		// TODO Auto-generated method stub
		
		return deprepo.save(deptentity);
		
		
	}

}
