package bootcamp.oop.polymorphism;

public abstract class Delivery {
	
	private static long counter = 0;
	protected String address;
	protected String clientName;
	protected final long id;
	
	
	//setter and getters were not implemented to save screen space
	public Delivery(String address, String clientName) {
		this.address=address;
		this.clientName = clientName;
		this.id = counter++;
	}
	
	public void deliver() {
		System.out.println("-----------------------");
		System.out.print("Hi I have a ");
		System.out.println(this);
		System.out.println("-----------------------");
	}
	
	
	
	public String toString() {
		return String.format("delivery number #%d for %s at %s\n", id, clientName, address);
	}


}