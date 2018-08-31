package com.capgemini.icici.domain;

public class Employee
{
	private int empId;
	private String empName;
	private double HRA;
	private double PF;
	public static final int PT=200;
	private double basicSalary;
	private double grossSalary;
	private double medical;
	private double netSalary;
	public Employee()
	{
		
	}
	public Employee(int empId,String empName,double basicSalary,double medical)
	{
		this.empId=empId;
		this.empName=empName;
		this.basicSalary=basicSalary;
		this.medical=medical;
	}
	
	public double netSalary()
	{
		HRA  = 0.5*basicSalary;
		PF  = 0.12*basicSalary;
		grossSalary = HRA+basicSalary+medical;
		netSalary = grossSalary-(PF+PT);
		return netSalary;
	}
	public void EmployeeInformation(int empId,String empName,double netSalary)
	{
		System.out.println("Employee id is:" +empId);
		System.out.println("Employee name is:" +empName);
		System.out.println("Net salary is:" +netSalary);
	}
	
}
