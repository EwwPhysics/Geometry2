package Geometry2;

/*
	Class: Cone.java
	Written by: Sasha Murray
	Date: Oct 19, 2021
	Description: a cone class
*/

public class Cone {
	private Circle base;
	private double height;
	
	public Cone() {
		this(new Circle(), 0);
	}
	
	public Cone(Circle base, double height) {
		this.base = base;
		this.height = height;
	}
	
	// Method name: getSurfaceArea
	// Parameters: none
	// Return type: double
	// Description: finds surface area of the cone
	public double getSurfaceArea() {
		return base.getArea() + Math.PI * base.getRadius() * getSlant();
	}
	
	// Method name: getSlant
	// Parameters: none
	// Return type: double
	// Description: finds slant of the cone
	public double getSlant() {
		return height * height + base.getRadius() * base.getRadius();
	}
	
	// Method name: getVolume
	// Parameters: none
	// Return type: double
	// Description: finds volume of the cone
	public double getVolume() {
		return base.getArea() * height;
	}
	
	public Circle getBase() {
		return base;
	}
	public void setBase(Circle base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return String.format("Cone [base=%s, height=%.2f, area=%.2f, volume=%.2f]", base, height, getSurfaceArea(), getVolume());
	}
	
}
