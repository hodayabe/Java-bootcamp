package javabootcamp.oopexam.kid;

import java.time.LocalDate;

import javabootcamp.oopexam.toy.Toy;

public class Kid {

	//fields
	private String name;
	private LocalDate birthDate ;
	
	
	//Constructors
	public Kid(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	
	//methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	public String toString() {
		return "Kid [name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}