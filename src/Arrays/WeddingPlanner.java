package Arrays;

import java.util.Scanner;

public class WeddingPlanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String name;
		int age;
		int column = 0;

		System.out.println("How many people are attending the wedding? (must be a multiple of 8)");
		int attendees = input.nextInt();

		if (attendees % 8 != 0) {
			System.out.println("Not a multiple of 8. Please enter a new number: ");
			attendees = input.nextInt();
		}

		Friend[][] wed = new Friend[8][attendees / 8];
		input.nextLine();
		for (int i = 0; i < (attendees / 8); i++) {
			for (column = 0; column < 8; column++) {

				System.out.println("Enter guest's name: ");
				name = input.nextLine();
				System.out.println("Enter guest's age: ");
				age = input.nextInt();
				input.nextLine();
				Friend guest = new Friend(name, age);

				wed[column][i] = guest;
			}
		}
		for (int j = 0; j < 8; j++) {
			for (int k = 0; k < (attendees / 8); k++) {
				System.out.print(wed[j][k].getName() + " ");
			}
			System.out.println();
		}
	}

}
