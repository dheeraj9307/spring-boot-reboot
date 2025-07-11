package com.dheerajpatel.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dheerajpatel.main.bean.Employee;
import com.dheerajpatel.main.config.SpringConfig;


public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Employee employee = (Employee) context.getBean("createEmp");

		System.out.println(employee);

    }
}
