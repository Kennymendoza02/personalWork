package decisions;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("What is your height?");
			double height = input.nextDouble();
			System.out.println("Your lucky number is " + height * 2);
		} else if (age < 18) {
			System.out.println("What is your weight?");
			double weight = input.nextDouble();
			System.out.println("Your lucky number is " + weight / 2);
		}
	}

}
