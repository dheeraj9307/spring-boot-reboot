package com.dheerajpatel.springbean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean("user") // at place of user you can gave any things
	public User createUser()
	{
		User user = new User();
		user.setFirstName("Dheeraj");
		user.setLastName("Patel");
		user.setEmail("dheerjpatel@gmail.com");

		return user;
	}

	@Bean("employeeeee")
	public Employee createEmployee()
	{
		Employee emp = new Employee();
		emp.setEmployeName("Dheeraj");
		emp.setEmployeSal(128000);
		return emp;
	}
}
