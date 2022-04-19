package JavaBootcamp.oop.Polymorphism.VendingMachine;

public abstract class Chocolate extends HotDrink {

	public Chocolate(int volume, int temperatture, float price, int spoonsSugar) {
		super(volume, temperatture, price, spoonsSugar);
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}

}