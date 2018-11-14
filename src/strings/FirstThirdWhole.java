package strings;

import java.util.Scanner;

public class FirstThirdWhole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter activity number: ");
		int activity = input.nextInt();
		
		switch(activity){
		
		case 1:
			input.nextLine();
			System.out.println("Type a sentence");
			String sentence = input.nextLine();
			char first = sentence.charAt(0);
			char third = sentence.charAt(2);
			System.out.println("First: " + first + " third: " + third + " whole: " + sentence);
		break;
		
		case 2:
			input.nextLine();
			System.out.println("Type a sentence");
			String sentence2 = input.nextLine();	
			System.out.println(sentence2.contains("Bob"));
		break;
		
		case 3:
			input.nextLine();
			System.out.println("Enter a name");
			String name1 = input.nextLine();
			System.out.println("Enter another name");
			String name2 = input.nextLine();
			
			if(name1.compareTo(name2) < 0) {
				System.out.println("The first name comes before the second name in alphabetiv order.");
			} else if (name1.compareTo(name2) == 0){
				System.out.println("The names are the exact same.");
			} else if (name1.compareTo(name2) > 0){
				System.out.println("The second name comes before the first name in alphabetiv order.");
			}
		break;
			
		case 4:
			input.nextLine();
			System.out.println("Enter a name");
			String name = input.nextLine();
			System.out.println("Enter another name");
			String nameSecond = input.nextLine();
			
			if(name.toUpperCase().compareTo(nameSecond.toUpperCase()) < 0) {
				System.out.println("The first name comes before the second name in alphabetiv order.");
			} else if (name.toUpperCase().compareTo(nameSecond.toUpperCase()) == 0){
				System.out.println("The names are the exact same.");
			} else if (name.toUpperCase().compareTo(nameSecond.toUpperCase()) > 0){
				System.out.println("The second name comes before the first name in alphabetiv order.");
			}
			break;
		}
	}

}
