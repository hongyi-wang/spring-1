package com.spring.beans;

public class HelloWorld {
	private String name;
	
	public void setHelloName(String name) {
		this.name = name;
	}

	public void hello() {
		System.out.println("hello " + name);
	}
}
