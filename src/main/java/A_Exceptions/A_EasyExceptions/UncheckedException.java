package A_Exceptions.A_EasyExceptions;


import java.awt.Color;

public class UncheckedException {
	public static void main(String[] args) {
		try {
			Color myColor=null;
			myColor.darker();
		}catch (NullPointerException e) {
			e.printStackTrace(System.out);
			System.out.println("NullPointerException");
		}
	}
}
