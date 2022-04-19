package JavaBootcamp.oop.Polymorphism.VendingMachine;
import JavaBootcamp.oop.Polymorphism.VendingMachineRunner.VendingMachine_Runner;


public class HotChocolate extends Chocolate {
	//fields
	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 80;
	private static final float PRICE = 12;
	private static final boolean BASE_OF_DRINK = true;//milk
	private static final int TEASPOON_OF_SUGGAR=1;



	//constructor
	public HotChocolate() {
		super(VOLUM, TEMPERATURE, PRICE, TEASPOON_OF_SUGGAR);
		if(VendingMachine_Runner.MAX_VOLUME < VOLUM)
			VendingMachine_Runner.MAX_VOLUME=VOLUM;
	}

	/**
	 * Preparation of the desired drink
	 */
	public void produce() {
		if(VendingMachine_Runner.milkQtt <VOLUM)
			System.out.println("Sorry ... due to lack of milk the machine can not prepare the drink you requested");
		else{
			System.out.println("frrrrrrrrrrrr Grrrrrrrrrrrrrr");
			System.out.println(this.toString()); 
			VendingMachine_Runner.milkQtt -= VOLUM;
		}
	}

	/**
	 * Printing the data on the drink
	 */
	@Override
	public String toString() {
		return "The Hot Chocola drink contain: "+super.toString();
	}
}