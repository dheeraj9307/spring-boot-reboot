package com.dheerajpatel.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dheerajpatel.main.bean.Employee;
import com.dheerajpatel.main.bean.SalaryInfo;

@Configuration
public class SpringConfig {
	@Bean
	public Employee createEmp()
	{
		// Constructor based DI
		Employee employee = new Employee("Dheeraj", createSalary());
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
