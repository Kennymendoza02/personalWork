package decisions;
import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two test scores: ");
		System.out.println("Test score 1: ");
		double testScore1 = input.nextDouble();
		System.out.println("Test score 2: ");
		double testScore2 = input.nextDouble();
		
		if (testScore1 > testScore2) {
			System.out.println("Great Job!");
			System.out.println("The difference between the scores is " + (testScore1 - testScore2));
		} 
		
		System.out.println("Have a nice day!");
	}

}
