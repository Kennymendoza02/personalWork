package mathOperators;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of a circle in inches");
		double radius = input.nextDouble();
		double pi = 3.14159265358979;
		
		double area = radius * radius * pi;
		
		System.out.println("The area of the circle is " + area + " square inches");
		
	}

}
