package JavaBootcamp.oop.Polymorphism.VendingMachine;

enum MaineIngredient{
	ORANGE,
	COCAlEAVES,
	LIMONLIME,
	APPLE
}

public abstract class ColdDrink extends Drink {
	
	private MaineIngredient maineIngredient;
	
	public ColdDrink(int volume, int temperatture, float price, MaineIngredient maineIngredient) {
		super(volume, temperatture, price);
		this.maineIngredient = maineIngredient;
	}


	@Override
	public void setTemperatture(int temperatture) {
			if(temperatture >= 2 && temperatture <= 5)
				this.temperatture = temperatture;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" the maine ingredient is "+this.maineIngredient;
	}

	

}