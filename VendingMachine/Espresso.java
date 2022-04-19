package JavaBootcamp.oop.Polymorphism.VendingMachine;
import JavaBootcamp.oop.Polymorphism.VendingMachineRunner.VendingMachine_Runner;

public class Espresso extends Coffee {

	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 80;
	private static final float PRICE = 10;
	private static final int TEASPOON_OF_SUGGAR = 2;
	private static final int NUMOFSHOT = 2;


	public Espresso() {
		super(VOLUM, TEMPERATURE, PRICE, TEASPOON_OF_SUGGAR,NUMOFSHOT);
		if(VendingMachine_Runner.MAX_VOLUME < VOLUM)
			VendingMachine_Runner.MAX_VOLUME=VOLUM;
	}

	/**
	 * Preparation of the desired drink
	 */
	public void produce() {
		if(VendingMachine_Runner.milkQtt <VOLUM - getShot()*50)
			System.out.println("The drink can not be prepared Espresso because there is not enough milk");
		else{
			System.out.println("frrrrrrrrrrrr Grrrrrrrrrrrrrr");
			System.out.println(this.toString()); 
			VendingMachine_Runner.milkQtt -= VOLUM - getShot()*50;
		}
	}

	/**
	 * Printing the data on the drink
	 */
	@Override
	public String toString() {
		return "The Espresso drink contain the "+super.toString();
	}



}
