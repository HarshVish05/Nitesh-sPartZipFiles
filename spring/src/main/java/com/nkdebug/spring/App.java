package com.nkdebug.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/nkdebug/spring/spring.xml");
    	
    	// ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
    	
        Vehicle vehicle = (Vehicle) context.getBean("car");
       
        vehicle.drive();
    	
    //	Tyre t = (Tyre)context.getBean("tyre");
    //	System.out.println(t);
    
    }
}
