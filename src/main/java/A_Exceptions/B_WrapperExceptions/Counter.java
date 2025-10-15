package A_Exceptions.B_WrapperExceptions;

public class Counter {
	private int count = 0;

	public Counter(int count) {
		this.count = count;
	}

	// The method increment () declares that it throws an exception
	public void increment(double amount) throws IllegalArgumentException {
		if (amount < 0) {
			throw new IllegalArgumentException("Negative amount not accepted");
		}
		count += amount;
	}

	public int getCount() {
		return count;
	}

	public static void test3() throws MyWrapperException {
		Counter oneCounter = new Counter(2);

		try {
			oneCounter.increment(-1);
		} catch (IllegalArgumentException e) {
			System.out.println("test3:Catch Block: Exception wrapped");
			// Wrapping the IllegalArgumentException in a custom exception object
			throw new MyWrapperException("MyException wrapper", e);
		}
		finally {
			System.out.println("In Finally Block: Count = " + oneCounter.getCount());
		}
	}
}
