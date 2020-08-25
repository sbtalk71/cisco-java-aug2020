package exceptions;

public class BankApp {

	public static void main(String[] args) {

		try {
			Bank bank = new Bank(10000);
			bank.withdraw(4000);
			bank.withdraw(5000);
			bank.withdraw(2000);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
