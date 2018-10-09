package objectOrientedProgramming;

public class Employee {

	private double wage;
	
	public Employee()
	{
		double wage = 7.25;
	}
	
	public double getWage()
	{
	return wage;	
	}
	
	public void setWage(double newWage)
	{
		wage = newWage;
	}
	public void increaseWage(double increase)
	{
		wage = wage + increase;
	}
}
