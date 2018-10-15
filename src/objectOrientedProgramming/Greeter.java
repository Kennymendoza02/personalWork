package objectOrientedProgramming;

//import the statements at the top

public class Greeter {

//instance fields - data storage
private int age;
//constructors - methods for constructing the object
			
//default constructor
public Greeter()
	{
	age = 17;
	//Statements to initialize the state of the object
	}
public int getAge()
{
	return age;
}
public void setAge(int newAge)
{
	age = newAge;
}
public void sayHello()
{
	System.out.println("Herrrrooo OwO");
}
//methods- things the object can do
}
