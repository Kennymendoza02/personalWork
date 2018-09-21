package mathOperators;

import java.util.Scanner;

public class BoxVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of the base of the box in inches?");
		double length = input.nextDouble();
		System.out.println("What is the width of the base of the box in inches?");
		double width = input.nextDouble();
		System.out.println("What is the height of the box?");
		double height = input.nextDouble();
		
		double volume = length * width * height;
		
		System.out.println("The volume of the box is " + volume + " square inches");
		
		
	}

}
