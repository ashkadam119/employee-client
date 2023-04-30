package com.capstone.client.project.service;

import com.capstone.client.project.exception.EmployeeIDException;
import com.capstone.client.project.vo.EmployeeVO;

public interface IEmployeeService {
	

	public EmployeeVO getEmployeeByEmployeeId(long employeeId) throws EmployeeIDException;

	

}
