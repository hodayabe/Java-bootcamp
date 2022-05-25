

public class BirdToToyDuckAdapter implements ToyDuck {
    private Sparrow sparrow;

    public BirdToToyDuckAdapter(Sparrow sparrow) {
        this.sparrow = sparrow;
    }
    

	@Override
	public void squeak() {
		System.out.println("This may sound like a bird but its a Toy duck squeaking:");
		sparrow.makeSound();
	}
    
    

    
}