package com.capstone.client.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.client.project.entity.Employee;
import com.capstone.client.project.exception.EmployeeIDException;
import com.capstone.client.project.repository.EmployeeRepo;
import com.capstone.client.project.vo.EmployeeVO;




@Service
public class EmployeeServiceImp  implements IEmployeeService{
	
	@Autowired
	EmployeeRepo repo;


	@Override
	public EmployeeVO getEmployeeByEmployeeId(long employeeId) throws EmployeeIDException {
		Employee employee = repo.findById(employeeId).orElseThrow(
				() -> new EmployeeIDException("Invalid EmployeeId : " + employeeId));
		EmployeeVO employeeVO = new EmployeeVO(employee.getEmployeeId(), employee.getEmployeeName(), employee.getDateOfBirth());
		return employeeVO;
	}

}
