package com.employeemgmt.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemgmt.departmentservice.Entity.DepartmentEntity;

@Repository

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long>{

}
