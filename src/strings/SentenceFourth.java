package strings;

import java.util.Scanner;

public class SentenceFourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int posCount = 0;
		System.out.println("Type a sentence");
		String sentence = input.nextLine();
		for(posCount = 0; posCount < sentence.length(); posCount += 4){
			System.out.println(sentence.charAt(posCount));
		}
	}

}
