package decisions;
import java.util.Random;
public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random(5);
		int heads = 0;
		for(int counter = 1; counter <= 1000000; counter++){
		int min = 0;
		int max = 100;
		int randomNum = min + generator.nextInt(max - min + 1);
		if(randomNum <= 50){
			heads++;
		}
		}
		
		System.out.println("heads: " + heads);
		System.out.println("tails: " + (1000000 - heads));
	}

}
