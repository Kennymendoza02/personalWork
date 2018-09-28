package mathOperators;

import java.util.Scanner;

public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dividend = ");
		int dividend = input.nextInt();
		System.out.println("Divisor = ");
		int divisor = input.nextInt();
		
		int wholeNumAnswer = dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println(wholeNumAnswer + "r" + remainder);
	}

}
