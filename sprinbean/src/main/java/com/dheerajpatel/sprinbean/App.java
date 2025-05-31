package com.dheerajpatel.sprinbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
          MyBean bean = context.getBean(MyBean.class);
          bean.hello();
    }
}
