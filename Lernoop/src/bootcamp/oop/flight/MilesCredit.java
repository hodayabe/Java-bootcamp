package bootcamp.oop.flight;

import java.util.Iterator;

public class MilesCredit {
	private Flight[] flight;
	private int baseMiles;
	private int bonosMiles;
	
	
	public MilesCredit(Flight[] flight, int baseMiles, int bonosMiles) {
		this.flight = flight;
		this.baseMiles = baseMiles;
		this.bonosMiles = bonosMiles;
	}
	
	
	public void setBaseMiles(int baseMiles) {
		this.baseMiles = baseMiles;
	}

	public void setBonosMiles(int bonosMiles) {
		this.bonosMiles = bonosMiles;
	}

	
	public void updateMiles(Flight[] flight) {
		
		for (int i = 0; i < flight.length; i++) {
			this.baseMiles = flight[i].getBaseMiles();
			this.bonosMiles =flight[i].getBonosMiles();
		}
	}
	

	

	

}