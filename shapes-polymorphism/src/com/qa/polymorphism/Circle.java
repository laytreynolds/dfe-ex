package com.qa.polymorphism;

public class Circle extends Shape {
	
	@Override
	public void area() {
		System.out.println("Circle is 3.14 * radius * radius ");
	}
	
}
