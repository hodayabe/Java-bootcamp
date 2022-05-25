package bird;

public class Penguin implements Moltable,Swimable{
	public String currentLocation;
    public int numberOfFeathers;
    
    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }
    
	@Override
	public void swim() {
		 this.currentLocation = "in the water";
	}

	@Override
	public void molt() {
		 this.numberOfFeathers -= 1;
	}

	
}
