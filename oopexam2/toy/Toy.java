package javabootcamp.oopexam.toy;

import java.time.LocalDate;

import javabootcamp.oopexam.kid.Kid;
import javabootcamp.oopexam.playable.Playable;



public abstract class Toy implements Playable {

	//fields

	private String name;
	private	LocalDate purchase;
	private final int serialNumber;
	private Kid kid;
	
	

	public Toy(String name, LocalDate purchase, int serialNumber, Kid kid) {
		super();
		this.name = name;
		this.purchase = purchase;
		this.serialNumber = serialNumber;
		this.kid = kid;
	}

	
	public boolean isBroken() {
		if((LocalDate.now().getYear()-purchase.getYear()>1))
			return true;
		return false;
	}

	public abstract void play();


	@Override
	public String toString() {
		return "Toy [name=" + name + ", purchase=" + purchase + ", serialNumber=" + serialNumber + ", kid=" + kid + "]";
	}










}
