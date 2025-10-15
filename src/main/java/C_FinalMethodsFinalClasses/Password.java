package C_FinalMethodsFinalClasses;

public class Password {
	private String password;
	
	public Password() {
		this.password="Secret";
	}

	protected final String getPassword() {
		return password;
	}

	protected final void setPassword(String password) {
		this.password = password;
	}
}
