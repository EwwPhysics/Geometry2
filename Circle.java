package Geometry2;

/*
	Class: Circle.java
	Written by: Sasha Murray
	Date: Oct 19, 2021
	Description: a circle class
*/

public class Circle {
	private double radius;
	
	public Circle() {
		this(0);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// Method name: getArea
	// Parameters: none
	// Return type: double
	// Description: finds area of the circle
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	// Method name: getCircumfrence
	// Parameters: none
	// Return type: double
	// Description: finds the circumfrence of the circle
	public double getCircumfrence() {
		return Math.PI * radius * 2;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return String.format("Circle [radius=%.2f, area=%.2f, circumfrence=%.2f]", radius, getArea(), getCircumfrence());
	}
	
}
