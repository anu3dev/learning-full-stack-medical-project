package com.anu3dev.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.anu3dev.dao.EmployeeListDAO;
import com.anu3dev.exception.ResourceNotFoundException;
import com.anu3dev.model.EmployeeList;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private EmployeeListDAO dao;
	
	@Override
	public List<EmployeeList> getAllEmployee() {
		return dao.findAll();
	}

	@Override
	public EmployeeList saveEmployeeData(EmployeeList emp) {
		return dao.save(emp);
	}

	@Override
	public ResponseEntity<EmployeeList> getEmployeeData(Long id) {
		EmployeeList emp = dao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: "+ id));
		return ResponseEntity.ok(emp);
	}

	@Override
	public ResponseEntity<EmployeeList> updateEmpoyeeData(Long id, EmployeeList emp) {
		EmployeeList employee = dao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: "+ id));
		employee.setFirstName(emp.getFirstName());
		employee.setLastName(emp.getLastName());
		employee.setEmailId(emp.getEmailId());
		
		EmployeeList updatedEmp = dao.save(employee);
		return ResponseEntity.ok(updatedEmp);
	}

	@Override
	public ResponseEntity<Map<String, Boolean>> deleteEmployeeData(Long id) {
		EmployeeList emp = dao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: "+ id));
		dao.delete(emp);
		Map<String, Boolean> res = new HashMap<String, Boolean>();
		res.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(res);
	}
}
