package outputExamples;

import java.util.Scanner;

public class MailingLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
	
		String firstName;
		String streetAddress;
		String csz;
		
		//First name
		System.out.println("Enter First Name");
		firstName = input.nextLine();
		
		//Street address
		System.out.println("Enter Street Address");
		streetAddress = input.nextLine();
		
		//City, State, and ZIP
		System.out.println("Enter City, State, and ZIP Code");
		csz = input.nextLine();
		
		System.out.println(firstName + System.lineSeparator() + streetAddress + System.lineSeparator() + csz);


		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		int myint = keyboard.nextInt();
		
		
		System.out.println("Kenny\n18495 Pleasant Street\nBrookfield, WI, 53045");
		
		System.out.println(myint);


	}

}
