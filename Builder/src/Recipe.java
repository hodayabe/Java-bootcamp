

public class Recipe {
	private final PastriesType pastriesType;
    private final float mozzarellaCheese;
    private final float fetaCheese;
    private final float mushrooms;
    private final float pineapple;
   

 
	public Recipe(PastriesType pastriesType, float mozzarellaCheese, float fetaCheese, float mushrooms,
			float pineapple) {
		this.pastriesType = pastriesType;
		this.mozzarellaCheese = mozzarellaCheese;
		this.fetaCheese = fetaCheese;
		this.mushrooms = mushrooms;
		this.pineapple = pineapple;
	}


	public PastriesType getPastriesType() {
		return pastriesType;
	}

	public float getMozzarellaCheese() {
		return mozzarellaCheese;
	}


	public float getFetaCheese() {
		return fetaCheese;
	}


	public float getMushrooms() {
		return mushrooms;
	}


	public float getPineapple() {
		return pineapple;
	}


	public String print() {
        String info = "";
        info += "Type of pastries: " + pastriesType + "\n";
        info += mozzarellaCheese + "gr mozzarella Cheese\n";
        info += fetaCheese + "gr feta Cheese\n";
        info += mushrooms + "gr mushrooms\n";
        info += pineapple + "gr pineapple\n";
       
        return info;
    }
	
	



	
    
}