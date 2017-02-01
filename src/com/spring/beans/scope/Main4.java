package com.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.autowire.Address;

public class Main4 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
//		Address address = (Address) ctx.getBean("address");
//		System.out.println(address);
		
		Address address = (Address) ctx.getBean("address2");
		System.out.println(address);
	}
}
