package decorator;

public class SportyDecorator extends DressDecorator{

	public SportyDecorator(Dress dress) {
		super(dress);
	}
	
	@Override
	public void create() {
		super.create();
		System.out.println("Sportiness Added...");
		
	}

}
