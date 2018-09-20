package inputExamples;

import java.util.Scanner;

public class VotingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Did you vote?");
		String vote = input.nextLine();

		if (vote.toLowerCase().contains("yes")) {
			System.out.println("You have voted");
		} else {
			System.out.println("You have not voted");
		}

	}

}
