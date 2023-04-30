package com.capstone.client.project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.capstone.client.project.entity.Employee;
import com.capstone.client.project.exception.EmployeeIDException;


@RestController
@RequestMapping("/client/employee")
public class ClientController {


	@Autowired
	RestTemplate restTemplate;
	
	String baseUrl = "https://localhost:8286/employee/";

	@GetMapping("/{employeeID}")
    public Employee getEmployeeById(@PathVariable int employeeID) throws EmployeeIDException {
        Employee employee = restTemplate.getForObject(baseUrl +employeeID, Employee.class);
        if (employee == null) {
            throw new EmployeeIDException("Employee not found with ID: " + employeeID);
        }
        return employee;
    }

}
