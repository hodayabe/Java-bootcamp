package ex2;

import java.util.List;

public class Apartment {
	
	private Address address;
	private List<Room> rooms;
	private boolean hasYard;
	private boolean hasBasement;
	private double area;
	
	
	public Apartment(Address address, List<Room> rooms, boolean hasYard, boolean hasBasement, double area) {
		this.address = address;
		this.rooms = rooms;
		this.hasYard = hasYard;
		this.hasBasement = hasBasement;
		this.area = area;
	}


	@Override
	public String toString() {
		return "Apartment [address=" + address + ", rooms=" + rooms + ", hasYard=" + hasYard + ", hasBasement="
				+ hasBasement + ", area=" + area + "]";
	}

	
	
	
	
}
