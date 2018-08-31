package com.capgemini.day3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.Employee;

class EmployeeTest
{
	
	Employee employee;
	@BeforeEach
	void setup()
	{
		employee = new Employee(1234,"Anusha",13000,2500);
	}
	@Test
	void testNetSalary()
	{
		assertEquals(20240.0,employee.netSalary(),0.03);
	}
	@AfterEach
	void tearDown()
	{
		employee=null;
	}

}
