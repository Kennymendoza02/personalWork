package objectOrientedProgramming;

import java.util.Scanner;

public class Room {

public Room()
{
	
}
	
public void area()
{
	Scanner input =  new Scanner(System.in);
	System.out.println("What is the length and height of the wall (in feet)?");
	
	System.out.println("Length = ");
	double length = input.nextDouble();
	
	System.out.println("Height = ");
	double height = input.nextDouble();
	
	double area = length * height;
	System.out.println("The area of the wall is " + area + " square feet.");
}

public void areaWithDoor()
{
	Scanner input =  new Scanner(System.in);
	System.out.println("What is the length and height of the wall (in feet)?");
	
	System.out.println("Length = ");
	double length = input.nextDouble();
	
	System.out.println("Height = ");
	double height = input.nextDouble();
	
	double area = length * height;
	
System.out.println("What is the length and height of the door (in feet)?");
	
	System.out.println("Length = ");
	double lengthDoor = input.nextDouble();
	
	System.out.println("Height = ");
	double heightDoor = input.nextDouble();
	
	double areaDoor = lengthDoor * heightDoor;
	
	double netArea = area - areaDoor;
	
	System.out.println("The area of the wall is " + netArea + " square feet.");

}

}
