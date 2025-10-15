package B_ConstructorChaining;


public class ConstructorChaining extends BaseConstructorClass{
	protected Salutation salutation;
	protected long bankAccountNumber;
	
	public ConstructorChaining() {
		super();
		this.salutation=Salutation.NOT_SET;
		this.bankAccountNumber=-1L;
	}
	
	public ConstructorChaining(Salutation salutation) {
		this();
		this.salutation=salutation;
	}
	
	public ConstructorChaining(long bankAccountNumber) {
		this();
	}
	
	public ConstructorChaining(Salutation salutation, long bankAccountNumber) {
		this(bankAccountNumber);
		this.salutation=Salutation.DONTKNOW;
	}
	
	public ConstructorChaining(Salutation salutation, long bankAccountNumber, int id, String name) {
		super(id, name);
		//this(salutation, bankAccountNumber); // cannot do a second call
	}
}
