package com.spring.beans.collection;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		//test list configure
//		Person person2 = (Person) ctx.getBean("person2");
//		System.out.println(person2);
//		
//		//test map configure
//		NewPerson newPerson = (NewPerson) ctx.getBean("newPerson");
//		System.out.println(newPerson);
//		
//		//test properties configure
//		DataSource dataSource = ctx.getBean(DataSource.class);
//		System.out.println(dataSource);
		
		//test util nameSpace configuration (use <util:list>)
		Person person4 = (Person) ctx.getBean("person4");
		System.out.println(person4);
		
		//test p nameSpace configuration (use <p:xxx>)
		Person person5 = (Person) ctx.getBean("person5");
		System.out.println(person5);
		
	}
}
