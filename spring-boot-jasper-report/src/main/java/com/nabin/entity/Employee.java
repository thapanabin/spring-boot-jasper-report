package com.nabin.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee_Tbl")
public class Employee {
	
	@Id
	int id;
	String designation;
	Date doj;
	String name;
	int salary;

}
