package strings;

import java.util.Scanner;

public class SSSSpliter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your SSN: ");
		String ssn = input.nextLine();
		
		ssn.replaceAll("-", "");
		ssn.replaceAll(" ", "");
		
		System.out.println(ssn.substring(0, 2));
		System.out.println(ssn.substring(3, 4));
		System.out.println(ssn.substring(5, 8));
	}

}
