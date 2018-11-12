package decisions;

import java.util.Scanner;

public class AverageSongLnegth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the song in minutes and seconds.");
		System.out.println("Minutes: ");
		int minutes = input.nextInt();
		System.out.println("Seconds: ");
		int seconds = input.nextInt();
		
		System.out.println("Enter the total number of songs on the device.");
		int songs = input.nextInt();
		
		int mAvg = minutes/songs;
		int sAvg = seconds/songs;
		
		System.out.println("The average song length is " + mAvg + " minutes and " + sAvg + " seconds.");
	}

}
