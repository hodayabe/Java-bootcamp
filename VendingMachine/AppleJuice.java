package JavaBootcamp.oop.Polymorphism.VendingMachine;

import JavaBootcamp.oop.Polymorphism.VendingMachineRunner.VendingMachine_Runner;

public class AppleJuice extends SoftDrink {
	//fields
	private static final MaineIngredient MAINE = MaineIngredient.APPLE;
	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 5;
	private static final float PRICE = 9;
	private static final Purchased PURCHASED = Purchased.BOTTLE;
	private static final Squeezed SQUEEZED = Squeezed.PASTEURIZED;

	
	public AppleJuice() {
		super(VOLUM, TEMPERATURE, PRICE, MAINE, PURCHASED,SQUEEZED);
		if(VendingMachine_Runner.MAX_VOLUME < VOLUM)
			VendingMachine_Runner.MAX_VOLUME=VOLUM;
	}
	
	public void produce() {
		System.out.println(this.toString());
	}
	
	/**
	 * Printing the data on the drink
	 */
	@Override
	public String toString() {
		return "The drink Apple Juice is readi and contain: "+super.toString();
	}

}