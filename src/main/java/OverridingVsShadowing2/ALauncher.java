package OverridingVsShadowing2;

public class ALauncher {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.x);
		
		Child c = new Child();
		System.out.println(c.x);
		
		p = c; // be careful here!
		c =(Child)p;
		System.out.println(p.x);
		System.out.println(c.x);
	}
}