package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int lockerComboFirst;
		int lockerComboSecond;
		int lockerComboThird;
		
		System.out.println("Enter first two integers of locker combination: ");
		lockerComboFirst = input.nextInt();
		
		System.out.println("Enter second two integers of locker combination: ");
		lockerComboSecond = input.nextInt();
		
		System.out.println("Enter last two integers of locker combination: ");
		lockerComboThird = input.nextInt();
		
		System.out.println(lockerComboFirst + "-" + lockerComboSecond + "-" + lockerComboThird);
		
	}

}
