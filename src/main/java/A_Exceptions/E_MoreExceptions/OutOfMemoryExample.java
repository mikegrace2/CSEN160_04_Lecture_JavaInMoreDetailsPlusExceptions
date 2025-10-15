package A_Exceptions.E_MoreExceptions;

public class OutOfMemoryExample {
	public static void consumeMemoryALot() throws OutOfMemoryError{
		final int N=1000000000;
		Object[] objArr=new Object[N];
		for (int i=0;i<N;i++) {
			objArr[i]=new DerivedClass();
		}
	}
	
	public static void main(String[] args) {
		try {		
			OutOfMemoryExample.consumeMemoryALot();
		}catch(OutOfMemoryError ex) {
			System.out.println("OutOfMemoryError stop object creation and call garbage collector!");
			System.gc();
		}		
	}
}
