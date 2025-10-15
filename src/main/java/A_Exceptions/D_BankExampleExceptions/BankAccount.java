package A_Exceptions.D_BankExampleExceptions;


public class BankAccount {
	public static final double MINIMUM = 100;
	private double balance = MINIMUM;	
	private String acctId;

	public BankAccount(String acctId) {
		this.acctId = acctId;
	}

	public double withdraw(double amount) throws BalanceTooLowException {
		if ((balance - amount) < MINIMUM)
			throw new BalanceTooLowException(balance - amount, "Balance less than minimum");

		balance -= amount;
		return amount;
	}

	public void deposit(double amount) throws Exception {
		if (amount < 0)
			throw new Exception("Cannot deposit negative amount");

		balance += amount;
	}

	public double getBalance() {
		return balance;
	}
}
