package decisions;

import java.util.Random;

public class RussianBois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int num = 0;
		for(int counter = 1; counter <= 248; counter++){
		int min = 26;
		int max = 43;
		int randomNum = min + generator.nextInt(max - min + 1);
		if(randomNum > 36){
			num++;
		}
		}
		System.out.println(num + " chernobyl chubbies are over three feet tall.");
	}

}