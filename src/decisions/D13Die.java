package decisions;
import java.util.Random;
public class D13Die {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		int num = 0;
		for(int counter = 1; counter <= 87; counter++){
		int min = 0;
		int max = 13;
		int randomNum = min + generator.nextInt(max - min + 1);
		if(randomNum % 3 == 0){
			num++;
		}
		}
		System.out.println(num + " multiples of three were rolled.");
	}

}
