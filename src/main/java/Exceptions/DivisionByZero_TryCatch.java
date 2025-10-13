package Exceptions;


public class DivisionByZero_TryCatch {
	public static void main(String[] args) {
		try { 
			System.out.println("Normal division 5 / 0 = "+(5/0));
		} 
		catch ( ArithmeticException e) { // statements to handle this exception
			System.out.println("ArithmeticException!");
		}
		catch ( AnotherException e ) { // statements to handle this exception
			System.out.println("AnotherException!");
		} 
		finally { // statements to be execute every time
			System.out.println("finally!");
		}
	}
}
