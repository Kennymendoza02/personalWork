package mathOperators;

import java.util.Scanner;

public class VolumeSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the sphere?");
		double radius = input.nextDouble();
		
		double volume = 3.1415924 * 4.0/3.0 * radius * radius * radius;
		System.out.println(volume);
	}

}
