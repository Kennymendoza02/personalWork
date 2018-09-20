package inputExamples;

import java.util.Scanner;

public class VotingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String vote;
		System.out.println("Did you vote?");
		vote = input.nextLine();
		
		System.out.println(vote);
	}

}
