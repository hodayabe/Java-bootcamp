package bootcamp.oop.exercise;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public abstract class HomeAppliance implements Appendable {

	//fields
	protected String manufacturer;
	protected int purchaseYear;
	protected int powerConsumption;


	//constructors

	public HomeAppliance(String manufacturer , int purchaseYear,int powerConsumption){
		setManufacturer(manufacturer);
		setPurchaseYear(purchaseYear);
		setPowerConsumption(powerConsumption);
	}

	//method
	public abstract int getConsumption(int hours);

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		if (manufacturer!=null) {
			this.manufacturer = manufacturer.toUpperCase();
		}
	}

	public int getPurchaseYear() {
		return purchaseYear;
	}


	public  int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		if(powerConsumption>0)
			this.powerConsumption = powerConsumption;
	}


	public void setPurchaseYear(int purchaseYear) {
		int currYear = (Calendar.getInstance()).get(Calendar.YEAR);
		if(purchaseYear>1900 && purchaseYear<=currYear)
			this.purchaseYear = purchaseYear;
		else
			this.purchaseYear = currYear;
	}

	@Override
	public String toString() {
		return "HomeAppliance [manufacturer=" + manufacturer + ", purchaseYear=" + purchaseYear + ", powerConsumption="
				+ powerConsumption + "]";
	}

	
	
	public LocalTime turnOn() {
		System.out.println("Appliance was turned on at "+ LocalTime.now());
		return LocalTime.now();
	}

	
	public long turnOff(LocalTime on) {
		long duration = on.until(LocalTime.now(), ChronoUnit.SECONDS);
		System.out.println("Appliance was turned off at "+ LocalTime.now()+" on duration[sec] = "+ duration);
		return duration;
		
	}

}
