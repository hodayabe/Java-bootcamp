package xmlExercise;

public class Car {
	
	private String manufacturer;
	private String model;
	private String year;
	private LicencePlate licencePlate;
	
	
	public Car(String manufacturer, String model, String year, LicencePlate licencePlate) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.licencePlate = licencePlate;
	}
	
	
	
	
	public String getManufacturer() {
		return manufacturer;
	}

	
	public String getModel() {
		return model;
	}

	public String getYear() {
		return year;
	}

	public LicencePlate getLicencePlate() {
		return licencePlate;
	}




	@Override
	public String toString() {
		return "Car [manufacturer=" + manufacturer + ", model=" + model + ", year=" + year + ", licencePlate="
				+ licencePlate + "]";
	}
	
	
	

	

}
