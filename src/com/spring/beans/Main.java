package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
/*		//spring's job
		HelloWorld hellowWorld = new HelloWorld();
		hellowWorld.setName("Howie");*/
		
		//1. create Spring IOC container object
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. get Bean object from IOC container
//		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld"); //use id to return Bean
//		HelloWorld helloWorld = ctx.getBean(HelloWorld.class); //use class return Bean (only when 1 object of that Bean exist) 
//		helloWorld.hello();
		
//		Car car = (Car) ctx.getBean("car");
//		System.out.println(car);
//
//		Car car2 = (Car) ctx.getBean("car2");
//		System.out.println(car2);


		Person person = (Person) ctx.getBean("person");
		System.out.println(person);


	}
}
