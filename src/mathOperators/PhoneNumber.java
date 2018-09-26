package mathOperators;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your phone number?");
		double pN = input.nextDouble();
		
		double first;
		double second;
		double third;
		
		double firstT = pN / 10000000;
		double middleT = pN / 10000;
		double lastF = 
		
		first = Math.floor(firstT);
		second = ( (Math.floor(middleT)) - (first * 1000) );
		third = pN - ((Math.floor(middleT)) * 10000);
		
				
		System.out.println("(" + (int)first + ")" +  (int)second + "-" + (int)third);
	}

}

