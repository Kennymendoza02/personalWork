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

		if (ssn.length() == 11) {
			System.out.println(ssn.substring(0, 3));
			System.out.println(ssn.substring(4, 6));
			System.out.println(ssn.substring(7, 11));
		} else if (ssn.length() == 9) {
			System.out.println(ssn.substring(0, 3));
			System.out.println(ssn.substring(3, 5));
			System.out.println(ssn.substring(5, 9));
		}
	}

}
