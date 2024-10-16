package com.anu3dev.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anu3dev.model.EmployeeList;
import com.anu3dev.service.IEmployeeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/employee/v1/")
public class EmployeeController {
	@Autowired
	private IEmployeeService empSer;
	
	@GetMapping("/employees")
	public List<EmployeeList> getAllEmp(){
		return empSer.getAllEmployee();
	}
	
	@PostMapping("/addEmployee")
	public EmployeeList addEmp(@RequestBody EmployeeList emp) {
		return empSer.saveEmployeeData(emp);
	}
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<EmployeeList> getEmp(@PathVariable Long id) {
		return empSer.getEmployeeData(id);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<EmployeeList> updateEmp(@PathVariable Long id, @RequestBody EmployeeList emp) {
		return empSer.updateEmpoyeeData(id, emp);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmp(@PathVariable Long id){
		return empSer.deleteEmployeeData(id);
	}
}
