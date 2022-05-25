package xmlExercise;

public class LicencePlate {

	private static int index=1;
	private int plateNumber;
	private String color;
	
	
	public LicencePlate(String color) {
		this.plateNumber = index++ ;
		this.color = color;
	}
	
	public int getPlateNumber() {
		return plateNumber;
	}

	public String getColor() {
		return color;
	}


	@Override
	public String toString() {
		return "LicencePlate [plateNumber=" + plateNumber + ", color=" + color + "]";
	}
	
	
	
	
	
	

}
