package JavaBootcamp.oop.Polymorphism.VendingMachine;

/**
 * 
 * @author Hodaya David
 *
 */
public abstract class Drink implements Produceable {
	private int volume;
	public int temperatture;
	private float price;
	
	/**
	 * The constructor gets 3 parameters:
	 * @param The volume of the glass
	 * @param Drinking temperature
	 * @param The price of drinking
	 */
	public Drink(int volume, int temperatture, float price) {
		setVolume(volume);
		this.temperatture = temperatture;
		setPrice(price);
	}
	

	public int getVolume() {
		return volume;
	}
	
	void setVolume(int volume) {
		if(volume >= 50 && volume <= 200)
			this.volume = volume;
	}
	
	public int getTemperatture() {
		return temperatture;
	}
	
	public abstract void setTemperatture(int temperatture);
	
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "volume of "+this.getVolume()+" cubic meters ,temperatture of "+this.getTemperatture()+" ,the price is "+this.getPrice();
	}

}