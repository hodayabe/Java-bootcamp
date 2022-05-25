package decorator;

public class DressDecorator implements Dress{
	
	Dress dress;
	

	
	public DressDecorator(Dress dress) {
		super();
		this.dress = dress;
	}



	@Override
	public void create() {
		this.dress.create();
		
	}
	

}
