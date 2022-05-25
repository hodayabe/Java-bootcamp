package decorator;

public class CasualDecorator extends DressDecorator{
	

	public CasualDecorator(Dress dress) {
		super(dress);
	}
	
	@Override
	public void create() {
		super.create();
		System.out.println("Casuality Added...");
		
	}
	

}
