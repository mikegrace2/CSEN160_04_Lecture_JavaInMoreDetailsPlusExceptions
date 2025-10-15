package B_ConstructorChaining;


public class ConstructorChainingBad {
	protected int x;
	protected int y;
	protected int z;
	
	public ConstructorChainingBad() {
		super();
		this.x=0;
		this.y=0;
	}
	
	public ConstructorChainingBad(int x, int y) {
		this();
		this.x=x;
		this.y=y;
	}

    // Already defined
	//public ConstructorChainingBad(int y, int z) {
	//	this(y, z);
	//}
	
	public ConstructorChainingBad(int x, int y, int z) {
		this(x, y);
		this.z=z;
	}	
}
