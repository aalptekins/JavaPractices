package ch09;

public class CircleTest {

	public static void main(String[] args) {

		Circle c1=new Circle(5);
		double c1Area=c1.calculateArea();
		double c1perimeter=c1.calculatePerimeter();
		Circle c2=new Circle();
		double c2Area=c2.calculateArea();
		double c2perimeter=c2.calculatePerimeter();
		System.out.println("The Area of circle is "+c1Area+"\n"+"The Perimeter of circle is "+ c1perimeter);
		System.out.println();
		System.out.println("The Area of circle is "+c2Area+"\n"+"The Perimeter of circle is "+ c2perimeter);
	
	}

}
