package A_Exceptions.A_EasyExceptions;

public class DivisionByZero {
	public static void main(String[] args) { 
		try {
			System.out.println("Normal division 5 / 0 = " + (5 / 0));
		}catch (ArithmeticException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
	}
}
