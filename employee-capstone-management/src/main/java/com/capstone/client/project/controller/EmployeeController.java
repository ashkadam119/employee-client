package com.capstone.client.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.client.project.exception.EmployeeIDException;
import com.capstone.client.project.service.IEmployeeService;
import com.capstone.client.project.vo.EmployeeVO;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	IEmployeeService service;
	
	@GetMapping("/{employeeID}")
    public EmployeeVO getEmployeeById(@PathVariable long employeeID) throws EmployeeIDException {
		logger.info("EmployeeId("+employeeID+") is called");
		return service.getEmployeeByEmployeeId(employeeID);
	}

}

