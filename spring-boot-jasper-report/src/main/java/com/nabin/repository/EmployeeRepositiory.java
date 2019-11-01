package com.nabin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nabin.entity.Employee;

public interface EmployeeRepositiory extends JpaRepository<Employee, Integer> {

}
