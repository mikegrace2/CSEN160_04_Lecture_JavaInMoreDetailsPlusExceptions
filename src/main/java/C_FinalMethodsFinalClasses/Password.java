package C_FinalMethodsFinalClasses;

public class Password {
	private String password;
	
	public Password() {
		this.password="Secret";
	}

	private final String getPassword() {
		return password;
	}

	private final void setPassword(String password) {
		this.password = password;
	}
}
