package decorator;

public class FancyDecorator extends DressDecorator {

	public FancyDecorator(Dress dress) {
		super(dress);
	}

	@Override
	public void create() {
		super.create();
		System.out.println("Fanciness Added...");
	}
}
