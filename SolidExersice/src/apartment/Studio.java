package apartment;

public class Studio implements Apartment {

	private int squareFootage;

	@Override
	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
		
	}

	@Override
	public void upgrade() {
		 squareFootage += 40;
	}

}
