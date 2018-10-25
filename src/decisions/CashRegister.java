package decisions;

public class CashRegister {

	private double balance;
	private int transactions;

	public CashRegister(){
		double balance = 500.00;
		int transactions = 0;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double addedBalance){
		if (addedBalance < 0){
			System.out.println("Transaction balance cannot be negative.");
		}
		balance = balance + addedBalance;
	}
	 public void sellSomething(){
		 transactions++;
	 }
	 
	 public void returnSomething(int returnItem, double returnBalance){
		if (returnBalance > 0){
			if (returnBalance <= balance){
			balance = balance - returnBalance;
			 transactions ++;
			} else {
				System.out.println("Balance too low to make a return of this magnitude.");
			}
		} else if (returnBalance < 0){
			System.out.println("Transaction balance cannot be negative.");
		}
	 }
	
	 
}
