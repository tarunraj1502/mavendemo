package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@RestController
public class EmployeeController {
@Autowired
EmployeeRepo repo;

@PostMapping("/saveEmp")
public Employee saveEmployeeDetails(@RequestBody Employee emp) {
	try {
		repo.save(emp);
	}catch(Exception e) {
		e.printStackTrace();
	}
	return emp;
}
//@GetMapping("/getbyname/{empname}")
//public List<Employee> findingName(@PathVariable(empname) String str){
//	return service
//}
}
