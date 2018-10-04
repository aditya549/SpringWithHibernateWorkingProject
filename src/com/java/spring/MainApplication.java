package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
		EmpDaoImpl em=(EmpDaoImpl)context.getBean("empdaoimpl");
		Employee e=new Employee();
		e.setId(1215);
		e.setEname("reddy");
		e.setEmail("reddy@gmail.com");
		em.insert(e);
	}
}
