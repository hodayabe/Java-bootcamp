package bootcamp.oop.polymorphism;

public class PizzaDelivery extends Delivery{
	
	protected String[] descriptions;
	protected float bill;
	
	
	public PizzaDelivery(String[] descriptions, float bill, String address, String clientName) {
		super(address, clientName);
		this.descriptions = new String[descriptions.length];
		for (int i = 0; i < descriptions.length; i++) {
			this.descriptions[i] = new String(descriptions[i]);
		}
		this.bill=bill;
	}
	
	public void deliver() {
		System.out.println("-----------------------");
		System.out.print("Hi I have a pizza ");
		System.out.println(this);
		System.out.println("-----------------------");
	}
	
	@Override
	public String toString() {
		String pizzaStr = super.toString();
		pizzaStr += String.format("Total of %d pizzas:\n", descriptions.length);
		for (String desc : descriptions) {
			pizzaStr += String.format("%s\n",desc);
		}
		pizzaStr += "Your total is "+bill;
		return pizzaStr;
	}

}
