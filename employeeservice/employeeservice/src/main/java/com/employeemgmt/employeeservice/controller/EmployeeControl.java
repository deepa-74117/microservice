package com.employeemgmt.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemgmt.employeeservice.model.EmployeeEntity;
import com.employeemgmt.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeControl {

	@Autowired
	private EmployeeService empservice;
	
	@PostMapping
	public ResponseEntity<EmployeeEntity> saveEmployee(@RequestBody EmployeeEntity emp) {
		//System.out.println(emp);
		return ResponseEntity.ok().body(empservice.saveEmployee(emp));
		
	}
	
	@GetMapping
	public List<EmployeeEntity> getEmployee(){
		return empservice.getEmployee();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<EmployeeEntity> updateEmployee(@RequestBody EmployeeEntity emp,
			@PathVariable Long id) {
		return ResponseEntity.ok().body(empservice.updateEmployee(emp,id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
		
		try {
			empservice.deleteEmployee(id);
			
			return ResponseEntity.ok("deleted successfully");
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no data found to delete");
		}
		
	}
	
	
}
