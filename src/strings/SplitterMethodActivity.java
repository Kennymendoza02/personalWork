package strings;

import java.util.Scanner;

public class SplitterMethodActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Enter a sentence.");
		String sentence = input.nextLine();
		
		System.out.println("Enter a keyword.");
		String keyword = input.nextLine();
		
		String[] data = sentence.split(keyword);
		
		System.out.println(data.length-1);
	
	}

}
