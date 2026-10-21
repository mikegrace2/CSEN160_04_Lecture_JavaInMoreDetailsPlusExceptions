package C_FinalMethodsFinalClasses;

public class PasswordCrack extends Password {
	// Does not work because password is private in Password class
    //public final String getPassword() {
	//	return password;
	//}

    // Does not work because password is private in Password class
	//public final void setPassword(String password) {
	//	this.password = password;
	//}
	
	public static void main(String[] args) {
		PasswordCrack myCrack=new PasswordCrack();
		//System.out.println(""+myCrack.getPassword());
	}
}
