package bootcamp.oop.polymorphism;

public class ParcelDelivery extends Delivery{

	protected int numItems;
	protected boolean isDoorside;

	
	public ParcelDelivery(String address, String clientName,int numItems, boolean isDoorside) {
		super(address, clientName);
		this.numItems=numItems;
		this.isDoorside=isDoorside;
	}
	
	@Override
	public String toString() {
		String ParcStr = super.toString();
		ParcStr += String.format("Total of %d items:\n", numItems);
		if(isDoorside)
			ParcStr +="I left it for you by the door.";
		return ParcStr;
	}


	public void deliver() {
		System.out.println("-----------------------");
		System.out.print("Hi I have have a parcel delivery");
		System.out.println(this);
		System.out.println("-----------------------");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
