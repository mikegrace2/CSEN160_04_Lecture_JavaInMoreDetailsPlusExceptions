package constructor_chaining;


public class BaseConstructorClass {
	protected int id;
	protected String name;
	
	public BaseConstructorClass() {
		System.out.println("BaseConstructorClass()");
		this.id=-1;
		this.name="";
	}
		
	public BaseConstructorClass(int id) {
		this("hell");
		this.id=id;
	}

	public BaseConstructorClass(String name){
		this();
		this.name=name;
	}	
	
	public BaseConstructorClass(int id, String name) {
		this();
		this.id=-1;
		this.name="";
	}
	
	public static void main(String[] args) {
		BaseConstructorClass base=new BaseConstructorClass();
	}
}

