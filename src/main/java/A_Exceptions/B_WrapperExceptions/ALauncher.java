package A_Exceptions.B_WrapperExceptions;

public class ALauncher {
	public static void main(String[] args) {
		try {
			Counter.test3();
		} catch (MyWrapperException e) {
			System.out.println("Main: " + e);
		}
	}
}