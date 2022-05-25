import java.util.List;

public class Pastry {
	private String  name;
	private double calories;
	private PastryLabel label;
	private  List<Ingredient> Ingredients;
	
	
	
	public Pastry(String name, double calories, PastryLabel label, List<Ingredient> ingredients) {
		this.name = name;
		this.calories = calories;
		this.label = label;
		Ingredients = ingredients;
	}
	
	
	@Override
	public String toString() {
		return "Pastry [name=" + name + ", calories=" + calories + ", label=" + label + ", Ingredients=" + Ingredients
				+ "]";
	}
	
	
	
	
	
	
	 
}
