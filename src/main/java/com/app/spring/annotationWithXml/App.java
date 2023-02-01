package com.app.spring.annotationWithXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	public static void main(String[] args) {

		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e = (Employee) context.getBean("accountant");
		e.work();
	
	
	}
  
}
