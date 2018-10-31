package decisions;

import java.util.Scanner;
import java.util.stream.IntStream;

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
				break;
			
		case 4: 
				int dong = 0;
				int counter1 = 0;
				for(counter1 = 1; counter1 < 11; counter1++){
					dong = counter1;
					dong = dong + counter1;
					
				}
				System.out.println(dong);
				break;
					
		case 5:
			System.out.println("Please enter a number");
			int numba = input.nextInt();
			int count = 0;
			int sum = 0;
			for(count = 0; count < 5; count++){
				sum = sum + numba;
			}
			System.out.println(sum);
				break;
			
		case 6:
			for(int column = 1; column <= 5; column++){
				
				for(int row = column; row <=6; row++){
					if(row==6){
						System.out.print(" " + column + " ");
					} else {
						System.out.print(" " + row + " ");
					}
				}System.out.println();
			}
			break;
			
		case 7:
			System.out.println("Enter a number to go through prime factorization");
			int numero = input.nextInt();
			int factor2 = 0;
			for(int factor = 2; factor<=7; factor = factor++){
				
				
					if (numero % factor == 0){
						factor2 = numero / factor;
						System.out.println("(" + factor + ")" + "(" + factor2 + ")");
				}
			}
			break;
			
		case 8:
		
			int factorr = 0;
			int tester;
			int sum1 = 0;
			
			for (int first = 1; first<=1000; first++){
			
				int[] data = new int[first];
				int pos;
			
				for (factorr = 1, pos = 0; factorr <= first + 1; factorr++){
				
					if (factorr <= first ){
				
						if(first % factorr == 0){
							data[pos] = factorr;
							pos++;
						}
					
					}
				
				} 
			
					sum1 = IntStream.of(data).sum();
					if(sum1 == first){
						System.out.println(first);
					}
				
			
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
