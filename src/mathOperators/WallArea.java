package mathOperators;
import java.util.Scanner;
public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of the wall in feet?");
		double length = input.nextDouble();
		
		double wallArea = length * 8.0;
		
		System.out.println("The wall is " + wallArea + " feet tall.");
	}

}
