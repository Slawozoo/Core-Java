package abstraction;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String colorCircle;
		String colorRect;
		String colorTriangle;
		float radius;
		int length, width;
		double base, height;
		
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		
		//Circle
		System.out.print("Color of circle: ");
		colorCircle = sc.nextLine();
		System.out.print("Radius of circle: ");
		radius = scn.nextFloat();
		
		//Rectangle
		System.out.print("Color of Rect: ");
		colorRect = sc.nextLine();
		System.out.print("Lenght and breadth of rectangle l & b: ");
		length = scn.nextInt();
		width = scn.nextInt();
		
		//Triangle
		System.out.print("Color of Triangle: ");
		colorTriangle = sc.nextLine();
		System.out.print("Base & height of triangle a & b: ");
		base = scn.nextDouble();
		height = scn.nextDouble();
		
		Shape s1 = new Circle(colorCircle, radius);
	    Shape s2 = new Rectangle(colorRect, length, width);
	    Shape s3 = new Triangle(colorTriangle, base, height);
	  
	    System.out.println(s1.toString());
	    System.out.println(s2.toString());
	    System.out.println(s3.toString());

	}

}
