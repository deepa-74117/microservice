package com.employeemgmt.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemgmt.departmentservice.Entity.DepartmentEntity;
import com.employeemgmt.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/dept")

public class DepartmentControl {
	
	@Autowired
	private DepartmentService deptser;
	
	@PostMapping()
	public ResponseEntity<DepartmentEntity> saveDept(@RequestBody DepartmentEntity deptentity){
		
		return new ResponseEntity<DepartmentEntity>(deptser.saveDept(deptentity),HttpStatusCode.valueOf(201));
		
	}
	

}
