package javabootcamp.oopexam.electricToy;

import java.time.LocalDate;

import javabootcamp.oopexam.kid.Kid;
import javabootcamp.oopexam.toy.Toy;


enum AgeCategory{
	A,
	B,
	C
}

public class ElectricToy<AgeCategory> extends  Toy {

	//fields
	private final int NUMBER_OF_BATTERIES ;
	private int soundLevel;
	private AgeCategory age;



	public ElectricToy(String name, LocalDate purchase, int serialNumber, Kid kid, int numberOfBatteries,
			int soundLevel, AgeCategory age) {
		super(name, purchase, serialNumber, kid);
		this.NUMBER_OF_BATTERIES = numberOfBatteries;
		this.soundLevel = soundLevel;
		this.age = age;
	}


	@Override
	public void play() {
		System.out.println("sound level now: "+this.soundLevel);
		System.out.println("yayyy....");
		this.soundLevel--;
		System.out.println("sound level after a play: "+this.soundLevel);

	}
		
		
	public int getSoundLevel() {
		return soundLevel;
	}

	
	
	public int getNumberOfBatteries() {
		return NUMBER_OF_BATTERIES;
	}


	public void setSoundLevel(int soundLevel) {
		if(soundLevel>=0 && soundLevel<=3)
			this.soundLevel = soundLevel;
	}


	@Override
	public String toString() {
		return "ElectricToy [NUMBER_OF_BATTERIES=" + NUMBER_OF_BATTERIES + ", soundLevel=" + soundLevel + ", age=" + age
				+ "]";
	}


	

}