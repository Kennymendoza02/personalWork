package mathOperators;

import java.util.Scanner;

public class FriendsAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("What age is your first friend?");
		int friend1 = input.nextInt();
		
		System.out.println("What age is your next friend?");
		int friend2 = input.nextInt();
		
		System.out.println("What age is your final friend?");
		int friend3 = input.nextInt();
		
		int totalAge = friend1 + friend2 + friend3;
		
		System.out.println("The sum of your friends' ages is " + totalAge);
	}

}
