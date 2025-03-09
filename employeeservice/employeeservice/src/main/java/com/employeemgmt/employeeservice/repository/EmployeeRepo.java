package com.employeemgmt.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemgmt.employeeservice.model.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long>{

}
