package com.nabin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nabin.entity.Employee;
import com.nabin.repository.EmployeeRepositiory;

@SpringBootApplication
@RestController
public class SpringBootJasperReportApplication {

	
	@Autowired
	private EmployeeRepositiory employeeRepositiory;
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		return employeeRepositiory.findAll();
	}
	
	@PostMapping("/employees")
	public void createEmployees(@RequestBody Employee employee) {
		
		employeeRepositiory.save(employee);
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJasperReportApplication.class, args);
	}
	
	

}
