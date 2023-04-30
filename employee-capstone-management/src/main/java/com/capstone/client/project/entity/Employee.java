package com.capstone.client.project.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {
	@Id
	 private Long employeeId;
	    private String employeeName;
	 
	    private LocalDate dateOfBirth;

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(Long employeeId, String employeeName, LocalDate dateOfBirth) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.dateOfBirth = dateOfBirth;
		}

		public Long getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfBirth="
					+ dateOfBirth + "]";
		}
	    
	    

}
