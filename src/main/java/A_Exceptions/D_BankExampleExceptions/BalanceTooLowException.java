package A_Exceptions.D_BankExampleExceptions;


public class BalanceTooLowException extends Throwable{
	private double howLow;
	
	public BalanceTooLowException(double amount, String message){ 
		super(message);
		howLow = amount;
	}
	
	public String toString(){ 
		return "Balance Too Low: " +howLow;
	}
}
