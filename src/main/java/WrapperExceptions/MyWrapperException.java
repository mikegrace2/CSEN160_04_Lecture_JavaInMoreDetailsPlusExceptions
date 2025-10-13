package WrapperExceptions;

@SuppressWarnings("serial")
public class MyWrapperException extends Throwable {
	public MyWrapperException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyWrapperException(String message) {
		super(message);
	}

	public String toString() {
		return super.getMessage() + " " + super.getCause().toString();
	}
}
