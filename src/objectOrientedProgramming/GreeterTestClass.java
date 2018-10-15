package objectOrientedProgramming;

import java.util.Scanner;

public class GreeterTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Greeter bob = new Greeter();

		System.out.println(bob.getAge());

		System.out.println("Enter a new age: ");

		int newAge = input.nextInt();
		bob.setAge(newAge);
		
		System.out.println(bob.getAge());

	}

}
