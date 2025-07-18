package com.dheerajpatel.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dheerajpatel.bean.Employee;
import com.dheerajpatel.config.AppConfig;

public class App 
{
	public static void main(String[] args) {
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp = (Employee) context.getBean(Employee.class);

		emp.showInfo();
    }
}
}