package inputExamples;

import java.util.Scanner;

public class BrokenBones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many of your own bones have you broken?");
		int myBrokenBones = input.nextInt();
		
		System.out.println("How many bones have you broken that weren't your own?");
		int theirBrokenBones = input.nextInt();
		
		int totalBrokenBones = myBrokenBones + theirBrokenBones;
		
		System.out.println("You have broken " + totalBrokenBones + " bones");
		
	}

}
