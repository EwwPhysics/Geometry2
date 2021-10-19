package Geometry2;

import java.util.Scanner;

/*
	Class: GeometryMain.java
	Written by: Sasha Murray
	Date: Oct 19, 2021
	Description: provides a public interface for the Cylinder, Cone, and Circle classes
*/

public class GeometryMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = 0;
		while (c != 3) {
			System.out.println("What do you want to do?\n"
					+ "0. Create a Circle\n"
					+ "1. Create a Cylinder\n"
					+ "2. Create a Cone\n"
					+ "3. Exit");
			c = s.nextInt();
			switch(c) {
				case 0: 
					System.out.println("What is the radius?");
					Circle circle = new Circle(s.nextDouble());
					System.out.println(circle);
					break;
				case 1:
					System.out.println("What is the radius of the base?");
					double r = s.nextDouble();
					System.out.println("What is the height?");
					Cylinder cylinder = new Cylinder(new Circle(r), s.nextDouble());
					System.out.println(cylinder);
					break;
				case 2:
					System.out.println("What is the radius of the base?");
					double rad = s.nextDouble();
					System.out.println("What is the height?");
					Cone cone = new Cone(new Circle(rad), s.nextDouble());
					System.out.println(cone);
					break;
				case 3:
					break;
				default:
					System.out.println("Please enter a number from 0 to 3.");
				System.out.println();
			}
		}
		s.close();
	}
}
