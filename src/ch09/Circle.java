package ch09;

public class Circle {

	double radius, pi = 3.14;
	
	public Circle() {
		radius=10;
	}
	
	public Circle(double radius) {
		this.radius=radius;	
	}
	
	double calculateArea()
	{		
		return pi*(radius*radius);
	}
	
	double calculatePerimeter()
	{
		return 2*(pi*radius);		
	}
	
	
}
