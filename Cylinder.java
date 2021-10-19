package Geometry2;

/*
	Class: Cylinder.java
	Written by: Sasha Murray
	Date: Oct 19, 2021
	Description: a cylinder class
*/

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder() {
		this(new Circle(), 0);
	}
	
	public Cylinder(Circle base, double height) {
		this.base = base;
		this.height = height;
	}
	
	// Method name: getSurfaceArea
	// Parameters: none
	// Return type: double
	// Description: finds surface area of the cylinder
	public double getSurfaceArea() {
		return base.getCircumfrence() * (base.getRadius() + height);
	}
	
	// Method name: getVolume
	// Parameters: none
	// Return type: double
	// Description: finds volume of the cylinder
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
