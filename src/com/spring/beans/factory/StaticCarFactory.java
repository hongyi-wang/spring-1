package com.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;


public class StaticCarFactory {
	private static Map<String, Car> cars = new HashMap<>();
	
	static {
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("ford", 400000));
	}
	//static factory method
	public static Car getCar(String name) {
		return cars.get(name);	
	}
}
