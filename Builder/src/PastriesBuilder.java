

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class PastriesBuilder implements Builder {
	private  PastriesType PastriesType;
	private float mozzarellaCheese;
    private float fetaCheese;
    private float mushrooms;
    private float pineapple;
    
    
    @Override
	public void setPastriesType(PastriesType PastriesType) {
		this.PastriesType=PastriesType;
	}
    
    @Override
    public void setMozzarellaCheese(float mozzarellaCheese) {
		this.mozzarellaCheese = mozzarellaCheese;
	}

    @Override
	public void setFetaCheese(float fetaCheese) {
		this.fetaCheese = fetaCheese;
	}

    @Override
	public void setMushrooms(float mushrooms) {
		this.mushrooms = mushrooms;
	}

    @Override
	public void setPineapple(float pineapple) {
		this.pineapple = pineapple;
	}


	public Pastries getResult() {
        return new Pastries( PastriesType,mozzarellaCheese,  fetaCheese,  mushrooms,  pineapple);
    }


	
}
