package com.dheerajpatel.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dheerajpatel.main.beans.Employee;
import com.dheerajpatel.main.beans.SalaryInfo;

@Configuration
public class SpringConfig
{
	@Bean
	public Employee createEmp()
	{
		// Constructor based DI
		Employee employee = new Employee("dheeraj");
		return employee;
	}

	@Bean
	public SalaryInfo createSalary()
	{
		// Constructor based DI
		SalaryInfo salaryInfo = new SalaryInfo(32436);
		return salaryInfo;
	}
}