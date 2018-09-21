package inputExamples;

import java.util.Scanner;

public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		System.out.println("What is your weight?");
		int weight = input.nextInt();
		
		System.out.println("You are " + age + " years old, and weigh " + weight + " pounds.");
		
	}

}
