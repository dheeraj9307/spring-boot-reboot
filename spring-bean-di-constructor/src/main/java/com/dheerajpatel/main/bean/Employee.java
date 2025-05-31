package com.dheerajpatel.main.bean;

public class Employee {
	private String empName;
	private SalaryInfo salaryInfo;

	public Employee(String empName, SalaryInfo salaryInfo)
	{
		this.empName = empName;
		this.salaryInfo = salaryInfo;
	}

	@Override
	public String toString()
	{
		return "empName  " + empName + " salaryInfo " + salaryInfo;
	}
}
