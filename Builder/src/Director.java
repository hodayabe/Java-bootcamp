
public class Director {
	
	 private final float trjy= 10;
	 private final float HawaiianPizza_mozzarellaCheese=100,HawaiianPizza_fetaCheese=40
			 ,HawaiianPizza_mushrooms=20,HawaiianPizza_pineapple=25,DominicanPuffPastry_mozzarellaCheese=10
			 ,DominicanPuffPastry_fetaCheese=100,DominicanPuffPastry_mushrooms=20,DominicanPuffPastry_pineapple=15;
	      
    public void constructHawaiianPizza(Builder builder) {
    	builder.setPastriesType(PastriesType.HAWAIIAN_PIZZA);
    	builder.setMozzarellaCheese(HawaiianPizza_mozzarellaCheese);
    	builder.setFetaCheese(HawaiianPizza_fetaCheese);
    	builder.setMushrooms(HawaiianPizza_mushrooms);
    	builder.setPineapple(HawaiianPizza_pineapple);
    }
    
    
    public void constructDominicanPuffPastry(Builder builder) {
    	builder.setPastriesType(PastriesType.DOMINICAN_PUFF_PASTERY);
    	builder.setMozzarellaCheese(DominicanPuffPastry_mozzarellaCheese);
    	builder.setFetaCheese(DominicanPuffPastry_fetaCheese);
    	builder.setMushrooms(DominicanPuffPastry_mushrooms);
    	builder.setPineapple(DominicanPuffPastry_pineapple);
    }

}