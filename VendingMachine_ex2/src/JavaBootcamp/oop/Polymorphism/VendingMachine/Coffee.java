package JavaBootcamp.oop.Polymorphism.VendingMachine;

public abstract class Coffee extends HotDrink {
private int shot;
	
	public Coffee(int volume, int temperatture, float price, int spoonsSugar, int shot) {
		super(volume, temperatture, price, spoonsSugar);
		setShot(shot);
	}

	public int getShot() {
		return shot;
	}

	public void setShot(int shot) {
		this.shot = shot;
	}

	
	@Override
	public String toString() {
		return super.toString()+" num of shot is "+this.getShot();
	}
	
}
