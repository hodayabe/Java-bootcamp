package apartment;

public class PenthouseSuite implements Apartment,SeveralRooms {

	private int squareFootage;
	private int numberOfBedrooms;

	
	@Override
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms=numberOfBedrooms;
		
	}

	@Override
	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
		
	}

	@Override
	public void upgrade() {
		  squareFootage += 40;
	      numberOfBedrooms += 1;
	}

	
}
