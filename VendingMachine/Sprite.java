package JavaBootcamp.oop.Polymorphism.VendingMachine;

import JavaBootcamp.oop.Polymorphism.VendingMachineRunner.VendingMachine_Runner;

public class Sprite extends SodaDrink {
	
	private static final MaineIngredient MAININGREDIENT = MaineIngredient.LIMONLIME;
	private static final int VOLUM = 200;
	private static final int TEMPERATURE = 4;
	private static final float PRICE = 9;
	private static final Purchased PURCHASED = Purchased.BOTTLE;

	public Sprite() {
		super(VOLUM, TEMPERATURE, PRICE, MAININGREDIENT, PURCHASED);
		if(VendingMachine_Runner.MAX_VOLUME < VOLUM)
			VendingMachine_Runner.MAX_VOLUME=VOLUM;
	}
	
	@Override
	public void produce() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "The drink Sprit is readi and contain "+super.toString();
	}
}