

public class Pastries {
	private final PastriesType PastriesType;
    private final float mozzarellaCheese;
    private final float fetaCheese;
    private final float mushrooms;
    private final float pineapple;
    
    
	public Pastries(PastriesType pastriesType, float mozzarellaCheese, float fetaCheese, float mushrooms,
			float pineapple) {
		PastriesType = pastriesType;
		this.mozzarellaCheese = mozzarellaCheese;
		this.fetaCheese = fetaCheese;
		this.mushrooms = mushrooms;
		this.pineapple = pineapple;
	}


	public PastriesType getPastriesType() {
		return PastriesType;
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
   

  


	
    
}