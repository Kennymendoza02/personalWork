package decisions;

import java.util.Scanner;

public class HeightAndShoeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your height and shoe size.");
		System.out.println("Height: ");
		int height = input.nextInt();
		System.out.println("Shoe size: ");
		int shoeSize = input.nextInt();
		
		System.out.println(height < 62);
		System.out.println(shoeSize > 9);
	}

}
