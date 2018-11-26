package strings;

import java.util.Scanner;

public class SentenceNoSpaceNoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int posCount = 0;
		System.out.println("Type a sentence");
		String sentence = input.nextLine();
		for(posCount = 0; posCount < sentence.length(); posCount ++){
			if(sentence.charAt(posCount) != 'a' && sentence.charAt(posCount)!= ' ' ){
				System.out.print(sentence.charAt(posCount));
			}
		}
		System.out.println();
		System.out.println(sentence);
	}

}
