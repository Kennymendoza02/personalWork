package decisions;

import java.util.Scanner;

public class PetsAndGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of pets in your household and the number of cars you can fit in your garage");
		System.out.println("Number of pets: ");
		int pets = input.nextInt();
		System.out.println("Max cars: ");
		int cars = input.nextInt();
		
		if (pets >= 5) {
			System.out.println("You have at least 5 pets");
		} else {
			System.out.println("You do not have at least 5 pets");
		}
		
		if (cars > 3) {
			System.out.println("You can fit 3 cars in your garage");
		} else {
			System.out.println("You can not fit 3 cars in your garage");
		}
	}

}
