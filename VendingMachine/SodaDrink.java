package JavaBootcamp.oop.Polymorphism.VendingMachine;

enum Purchased{
	CAN,
	BOTTLE
}

public abstract class SodaDrink extends ColdDrink {
	
	private Purchased purchased;

	public SodaDrink(int volume, int temperatture, float price, MaineIngredient maineIngredient, Purchased purchased) {
		super(volume, temperatture, price, maineIngredient);
		setPurchased(purchased);
	}

	public Purchased getPurchased() {
		return purchased;
	}

	public void setPurchased(Purchased purchased) {
		this.purchased = purchased;
	}
	
	@Override
	public String toString() {
		return super.toString()+" and the purchased in a "+this.purchased;
	}

}
