package com.anu3dev.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.anu3dev.model.EmployeeList;

public interface IEmployeeService {
	public List<EmployeeList> getAllEmployee();
	public EmployeeList saveEmployeeData(EmployeeList emp);
	public ResponseEntity<EmployeeList> getEmployeeData(Long id);
	public ResponseEntity<EmployeeList> updateEmpoyeeData(Long id, EmployeeList emp);
	public ResponseEntity<Map<String, Boolean>> deleteEmployeeData(Long id);
}
