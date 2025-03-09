package com.employeemgmt.departmentservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Department_entity")

public class DepartmentEntity {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	
	private String deptId;
	private String deptName;
	public DepartmentEntity() {
		super();
	}
	public DepartmentEntity(String deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "DepartmentEntity [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
	
	

}
