package bootcamp.oop.flight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {
	private final int FLIGHT_NUM;
	private static int flightCounter = 0;
	private LocalTime departureTime;
	private LocalTime actualDepartureTime;
	private LocalDate departureDate;
	private int flightDuration;
	private int minutesOfDelay;
	private int baseMiles;
	private int bonosMiles;
	
	
	public Flight(LocalTime departureTime, LocalDate departureDate, int flightDuration,int baseMiles, int bonosMiles) {
		this.FLIGHT_NUM =flightCounter++;
		setDepartureTime(departureTime);
		setDepartureDate(departureDate);
		setFlightDuration(flightDuration);
		actualDepartureTime = this.departureTime;
		minutesOfDelay = 0;
		setBaseMiles(baseMiles);
		setBonosMiles(bonosMiles);
	}
	
	
	//Methods:
	private void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	private void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	
	private void setFlightDuration(int flightDuration) {
		this.flightDuration = flightDuration;
	}
	
	public int getFLIGHT_NUM() {
		return FLIGHT_NUM;
	}
	
	public void delayFlight(int minutes) {
		minutesOfDelay += minutes;
	}
	
	public LocalTime getArrivalTime() {
		return departureTime.plusMinutes(flightDuration + minutesOfDelay);
	}


	int getBaseMiles() {
		return baseMiles;
	}


	public void setBaseMiles(int baseMiles) {
		this.baseMiles = baseMiles;
	}


	public int getBonosMiles() {
		return bonosMiles;
	}


	public void setBonosMiles(int bonosMiles) {
		this.bonosMiles = bonosMiles;
	}
	
}