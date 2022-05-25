package JavaBootcamp.oop.Polymorphism.VendingMachine;

public abstract class HotDrink extends Drink {
	
	private int sugar;

	public HotDrink(int volume, int temperatture, float price, int sugar) {
		super(volume, temperatture, price);
		setSugar(sugar);
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
	@Override
	public String toString() {
		return super.toString()+" and " +this.sugar+ " teaspoons of sugar ";
	}

	@Override
	public void setTemperatture(int temperatture) {
			if(temperatture >= 60 && temperatture <= 90)
				this.temperatture = temperatture;
	}
	

}
