package com.dheerajpatel.main.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dheerajpatel.main.beans.Address;
import com.dheerajpatel.main.beans.Employee;

@Configuration
public class SpringConfig {
	@Bean
	public Employee createEmployee()
	{
		Employee employee = new Employee();
		employee.setFirstName("dheeraj");
		employee.setLastName("patel");
		employee.setEmail("dheeraj@gmail.com");
		employee.setBand("A");
		// DI
		employee.setAddress(createAddress());

		return employee;
	}

	@Bean
	public Address createAddress()
	{
		Address address = new Address();
		address.setLine1("23rd main");
		address.setLine2("27th cross");
		address.setCity("BLR");
		address.setPinCode("560078");
		return address;
	}

}
