package com.capstone.client.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.client.project.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
