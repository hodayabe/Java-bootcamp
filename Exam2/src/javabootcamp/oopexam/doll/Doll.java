package javabootcamp.oopexam.doll;

import java.time.LocalDate;

import javabootcamp.oopexam.kid.Kid;
import javabootcamp.oopexam.toy.Toy;

enum Type{
	SOFT,
	HARD
}

enum AgeCategory{
	A,
	B,
}

public class Doll extends Toy {
	private int dirtiness;
	private Type type;
	private AgeCategory age;
	

	public Doll(String name, LocalDate purchase, int serialNumber, Kid kid, int dirtiness, Type type, AgeCategory age) {
		super(name, purchase, serialNumber, kid);
		this.dirtiness = dirtiness;
		this.type = type;
		this.age = age;
	}


	@Override
	public void play() {
		System.out.println("Dirt level now: "+this.dirtiness);
		System.out.println("yayyyyyy....!!!!");
		this.dirtiness++;
		System.out.println("Dirt level after a play: "+this.dirtiness);
	}


	public int getDirtiness() {
		return dirtiness;
	}



	public void setDirtiness(int dirtiness) {
		if(dirtiness>=1 && dirtiness<=10)
			this.dirtiness = dirtiness;
	}



	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}


//	@Override
//	public String toString() {
//		return "Doll [dirtiness=" + dirtiness + ", type=" + type + ", age=" + age + "]";
//	}
	
	

}

