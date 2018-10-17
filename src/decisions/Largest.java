package decisions;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three random integers.");
		System.out.println("Integer 1: ");
		int int1 = input.nextInt();
		System.out.println("Integer 2: ");
		int int2 = input.nextInt();
		System.out.println("Integer 3: ");
		int int3 = input.nextInt();
		
		if (int1 > int2){
		
			if (int1 > int3){
				System.out.println(int1);
			} else if (int2 < int3) {
				System.out.println(int1 + ", " + int3);
			}
			
		} else if (int2	> int1){
			
			if (int2 > int3){
				System.out.println(int2);
			} else {
				System.out.println(int2 + ", " + int3);
			}
		} else if (int2 == int1) {
			if (int2 < int3){
				System.out.println(int3);
			} else if (int2 > int3){
				System.out.println(int1 + ", " + int2);
			}
		} else {
			System.out.println("That ain't it chief");
		}
		}
	}
