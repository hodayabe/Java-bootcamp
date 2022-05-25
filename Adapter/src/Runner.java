

public class Runner {
	 public static void main(String[] args) {
		
		 Sparrow sparrow = new Sparrow();
		 sparrow.fly();
		 sparrow.makeSound();
		 
		PlasticToyDuck plasticToyDuck = new PlasticToyDuck();
		plasticToyDuck.squeak();
		
		BirdToToyDuckAdapter birdToToyDuckAdapter = new BirdToToyDuckAdapter(sparrow);
		 
		birdToToyDuckAdapter.squeak();
	     
		
		
	    }
}
