package C_FinalMethodsFinalClasses;

import java.lang.reflect.Field;

public class PasswordCrack2 {
	public static void main(String[] args) throws ReflectiveOperationException {
		Password password = new Password();
		Field passwordField = Password.class.getDeclaredField("password");
		passwordField.setAccessible(true);

		String crackedPassword = (String) passwordField.get(password);
		System.out.println(crackedPassword);
	}
}
