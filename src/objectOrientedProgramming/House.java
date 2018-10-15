package objectOrientedProgramming;

import java.util.Scanner;

public class House {

	public House()
	{
	}
	
	public void paintAWall()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length and height of the wall (in feet)?");
		System.out.println("Length = ");
		double length = input.nextDouble();
		System.out.println("Height = ");
		double height = input.nextDouble();
		
		double wallArea = length * height;
		double timePaint = wallArea / 200;
		
	}
	
}
