package decorator;

public class Runner {

	public static void main(String[] args) {
		
		
		// basic dress
		System.out.println("\r--------------------------------------\r");
		Dress basicDress=new BasicDress("Orange","M");
		basicDress.create();
		
		
		// basic but fancy dress
		System.out.println("\r--------------------------------------\r");
		Dress dress2=new FancyDecorator(basicDress);
		dress2.create();
		
		// basic but casual dress
		System.out.println("\r--------------------------------------\r");
		Dress dress3=new CasualDecorator(basicDress);
		dress3.create();
		
		// basic fancy but sporty dress
		System.out.println("\r--------------------------------------\r");
		Dress dress4=new SportyDecorator(
								new FancyDecorator(basicDress));
		dress4.create();
		
		// basic fancy but casual dress
		System.out.println("\r--------------------------------------\r");
		Dress dress5=new CasualDecorator(
								new FancyDecorator(basicDress));
		dress5.create();
		
		// basic sporty casual but fancy dress
		System.out.println("\r--------------------------------------\r");
		Dress dress6=new FancyDecorator(
								new CasualDecorator(
									new SportyDecorator(basicDress)));
		dress6.create();
		
		
	}

}
