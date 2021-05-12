package com.oops;

abstract class Shape {
	abstract double getArea();

	abstract double getPerimeter();
}

class Circle extends Shape {

	final static double pi = 3.14;
	float radius;

	Circle() {
		radius = 0;
	}

	public Circle(float radius) {
		this.radius = radius;
	}

	double getArea() {
		return pi * (radius * radius);
	}

	double getPerimeter() {
		return 2 * (pi * radius);
	}
}

class Square extends Shape {

	float side;

	public Square(float side) {
		this.side = side;
	}

	double getArea() {
		return side * side;
	}

	double getPerimeter() {
		return 4 * side;
	}

}

public class Shape_Program {

	public static void main(String[] args) {
		Shape s = new Circle(3);
		System.out.println("Area of circle = " + s.getArea());
		System.out.println("Perimeter of circle = " + s.getPerimeter());
		Shape s2 = new Square(4);
		System.out.println("Area of square = " + s2.getArea());
		System.out.println("Perimeter of square = " + s2.getPerimeter());

	}
}
