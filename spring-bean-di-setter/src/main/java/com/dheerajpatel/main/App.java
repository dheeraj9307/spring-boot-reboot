package com.dheerajpatel.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dheerajpatel.main.beans.Employee;
import com.dheerajpatel.main.resources.SpringConfig;
import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// Create IOC container

    			ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

    			// Get the Employee(bean) object from spring ioc container

    			Employee employee = (Employee) context.getBean("createEmployee");

    			employee.displayEmpDetails();
    }
}
