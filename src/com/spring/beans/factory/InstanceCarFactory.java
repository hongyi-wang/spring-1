package com.spring.beans.factory;


import java.util.HashMap;
import java.util.Map;


public class InstanceCarFactory {
	private static Map<String, Car> cars = new HashMap<>();
	
	public InstanceCarFactory() {
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("ford", 400000));
	}
	
	public Car getCar(String name) {
		return cars.get(name);	
	}
}