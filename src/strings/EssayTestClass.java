package strings;

import java.util.Scanner;

public class EssayTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Essay bob = new Essay();
		bob.name("Kenny Mendoza");
		String testFind = bob.findLastName();
		System.out.println(testFind);
		int testFind2 = bob.firstNameChar();
		System.out.println(testFind2);
		bob.containsX();
		
		String next = input.nextLine();
		bob.text(next);
		int number = bob.essayLength();
		System.out.println(number);
	}

}
