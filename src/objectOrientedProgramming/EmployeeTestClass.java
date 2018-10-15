package objectOrientedProgramming;

import java.util.Scanner;

public class EmployeeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Employee jon = new Employee();
		
		System.out.println("your hourly wage was " + jon.getWage() );
		
		System.out.println("What is you new hourly wage?");
		System.out.println("Hourly Wage: ");
		double newWage = input.nextDouble();
		jon.setWage(newWage);
		 
		System.out.println("Your new hourly wage is: " + jon.getWage());
		
		Employee bob = new Employee();
		double increase = bob.getWage() * 0.10;
		bob.increaseWage(increase);
		
		System.out.println(bob.getWage());
		
		
	}
}
