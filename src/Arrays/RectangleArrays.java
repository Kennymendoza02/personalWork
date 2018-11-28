package Arrays;

import java.util.Random;
import java.util.Scanner;

public class RectangleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 10;
		int max = 56;
		int width = 0;
		int length = 0;
		int smallest = 56;
		int small = 0;
		Rectangle smallestI = new Rectangle();
		
		for(int i = 0; i <100; i++){
			Rectangle[] data = new Rectangle[100];
			width = min + generator.nextInt(max - min + 1);
			length = min + generator.nextInt(max - min + 1);
			Rectangle r = new Rectangle(length, width);
			data[i] = r;
			
			for(i = 0; i < 100; i++);{
				System.out.println(data[i].getLength());
				System.out.println(data[i].getWidth());
				System.out.println(data[i].area());
			
				if(smallest > data[i].area()){
					smallest = data[i].area();
					small = i;
				}
			}
			
		}
	}

}
