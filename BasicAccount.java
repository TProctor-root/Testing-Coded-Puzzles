public class BasicAccount extends BankAccount {
	private double money;

	public BasicAccount(double d) {
		money = d;
		
	}
	public void withdraw(double amount) {
		if(money < amount) {
			
		}
		else {
			money = money - amount;
		}
	}
	public void deposit(double amount) {
		money = money + amount;
	}
	public double getBalance() {
		return money;
	}
} 