package decisions;

import java.util.Scanner;

public class Stuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age (in integer format): ");
		long age = input.nextLong();
		
		 if (age==16){
			 System.out.println("You are 16 years old.");
		 } else {
			 System.out.println("You are not 16 years old.");
		 }
		
		 
		 
		 
		 
		 System.out.println("Enter your shoe size then your height");
		 System.out.println("Shoe size: ");
		 double shoeSize = input.nextDouble();
		 System.out.println("Height(in feet): ");
		 double height = input.nextDouble();
		 
		 if (shoeSize + height >= 26){
			 System.out.println("Your shoe size added to your height is greater than or equal to 26.");
		 } else {
			 System.out.println("Your shoe size added to your height is not greater than or equal to 26.");
		 }
		 
		 
		 
		 
		 
		 
	}

}
