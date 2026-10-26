package E_OverridingVsShadowing;


public class Silly {
	private int x; 
	
	public Silly() {
		this.x=0;
	}
	
	public void example (int x) {
		System.out.println("Before: this.x="+this.x);
		System.out.println("Before: param x="+x);
		
		// x shadows instance variable 
		int a = x+1; 
		
		while (a > 3) { 
			x = 1; // local variable shadows error: variable x is already defined in method example(int)
            //x =1 ;
			a = a - x; 
		} 
		
		System.out.println("After: this.x="+this.x);
		System.out.println("After: param x="+x);		
	} 
	
	public static void main(String[] args) {
		Silly mySil=new Silly();
		mySil.example(10);
	}
}
