
public class Runner {

	 public static void main(String[] args) {
	        Director director = new Director();

	      
	        //HawaiianPizza
	        PastriesBuilder pizzaBuilder = new PastriesBuilder();
	        director.constructHawaiianPizza(pizzaBuilder);
	        Pastries pizza = pizzaBuilder.getResult();
	        System.out.println("Pizza built:\n" + pizza.getPastriesType());

	        //HawaiianPizza-Recipe
	        RecipeBuilder pizzaRecipeBuilder = new RecipeBuilder();
	        director.constructHawaiianPizza(pizzaRecipeBuilder);
	        Recipe pizzaRecipe = pizzaRecipeBuilder.getResult();
	        System.out.println("\npizza Recipe built:\n" + pizzaRecipe.print());
	        
	        
	      //HawaiianPizza
	        PastriesBuilder puffBuilder = new PastriesBuilder();
	        director.constructDominicanPuffPastry(puffBuilder);
	        Pastries puuf = puffBuilder.getResult();
	        System.out.println("Puff built:\n" + puuf.getPastriesType());

	        //HawaiianPizza-Recipe
	        RecipeBuilder puffRecipeBuilder = new RecipeBuilder();
	        director.constructDominicanPuffPastry(puffRecipeBuilder);
	        Recipe puffRrecipe = puffRecipeBuilder.getResult();
	        System.out.println("\nPuff Recipe built:\n" + puffRrecipe.print());
	        
	        
	        
	        
	        
	        
	        

	    }
	 
	 

	 
}
