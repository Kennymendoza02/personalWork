package objectOrientedProgramming;

public class Numbers {

	public Numbers()
	{
	}
	
	public void sayNumber(double num)
	{
		System.out.println("Your number is: " + num);
	}
	public void sayNumberPlus2(double num2)
	{
		System.out.println("Your number is: " + (num2 + 2));
	}
	public void saySum(double num, double num2)
	{
		System.out.println("Your number is: " + (num + num2));
	}
	public double returnSquare(double number)
	{
	number = number * number;
	return number;
	}
	public double returnArea(double length, double width)
	{
		double area = length * width;
		return area;
	}
	public double roundUp(double num17)
	{
		return Math.ceil(num17);
	}
}
