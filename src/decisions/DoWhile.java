package decisions;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter activity number.");
		int activity = input.nextInt();
		
		switch (activity)
		{
		case 1:
		System.out.println("Please enter a number");
		int num = input.nextInt();
		do
		{
			int product = num * 17;
			System.out.println("Magic product is: " + product);
			System.out.println("Please enter a number");
			num = input.nextInt();
		} while(num !=9999);
		break;
		
		case 2:
			int largest = 0;
			System.out.println("Please enter a number");
			int num1 = input.nextInt();
			do
			{
				if (num1 > largest)
				System.out.println("Please enter a number");
				num1 = input.nextInt();
			} while(num1 !=9999);
			System.out.println(largest);
			break;
			
		case 3:
			System.out.println("How many hellos would you like?");
			int numberOfHellos = input.nextInt();
			int counter = 0;
			for(counter = 1; counter < 11; counter++){
				System.out.println(numberOfHellos + " Hello");
			}
		}
	}

}
