package objectOrientedProgramming;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeter bob = new Greeter();
		bob.sayHello();
		
		Friend john = new Friend();
		john.sayMessage();
		
		bob.sayHello();
		bob.sayHello();
		bob.sayHello();
		john.sayMessage();
		bob.sayHello();
	}

}
