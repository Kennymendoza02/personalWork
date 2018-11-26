package decisions;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your salary?");
		
		System.out.println("Salary: ");
		int salary = input.nextInt();
		
		if (salary < 20000){
			System.out.println("You are a worker.");
		} else {
			if (salary <= 20000){
				System.out.println("Your are a part of the managemnet staff.");
			} else {
				if (salary <= 100000){
					System.out.println("You are a CEO.");
				} else {
						System.out.println("You are the owner!!!");
				}
			}
		}
	}

}
