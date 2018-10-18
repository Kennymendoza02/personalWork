package decisions;

import java.util.Scanner;

public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("How much money did you get for your fuifth birthday?");
		double money = input.nextDouble();
		double epsilon = 0.000001;
		if (Math.abs(money - Math.sqrt(84.3))<= epsilon){
			System.out.println("You won a good prize!");
		} else {
			System.out.println("Ur mom double gay");
		}
		
	}

}
