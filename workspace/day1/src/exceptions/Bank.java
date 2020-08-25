package exceptions;

public class Bank {
	private double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	public double withdraw(double amount) {
		try {
			if (balance < amount) {
				throw new LowBalanceException("Your Balance is too low");
			} else {
				System.out.println("transaction done ");
				balance = balance - amount;
				System.out.println("transaction done, remaining Balance is  " + balance);

			}
		} catch (LowBalanceException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return balance;
	}
}
