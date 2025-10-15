package A_Exceptions.A_EasyExceptions;

public class CheckedException {
	public static void main(String[] args) throws NumberFormatException{
		String input="15%";
		
		int myInt=Integer.parseInt(input);
		
		System.out.println(""+myInt);
	}
}

