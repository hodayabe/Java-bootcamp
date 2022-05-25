package bird;

public class Eagle implements Flyable,Moltable{
	
	public String currentLocation;
    public int numberOfFeathers;
    
    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }
    
	@Override
	public void molt() {
		numberOfFeathers -= 1;
		
	}
	@Override
	public void fly() {
		currentLocation = "in the air";
	}

}
