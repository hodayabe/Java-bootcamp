package bootcamp.oop.lights;

public class Lights {
	
	//fields
	private int numOfLight;
	private boolean isOn;
	
	
	//Constructor
	public Lights(int numOfLight,boolean isOn) {
		setNumOfLight(numOfLight);
		setIsOn(isOn);
	}
	
	public Lights() {
		this(3,true);
	}
	
	
	//method
	
	public int getNumOfLight() {
		return numOfLight;
	}
	
	public boolean getIsOn() {
		return isOn;
	}
	
	public void setNumOfLight(int numOfLight) {
		if(numOfLight>0 && numOfLight<=50)
			this.numOfLight=numOfLight;
	}
	
	public void setIsOn(boolean state) {
		isOn=state;
	}
	
	public void turnOn() {
		isOn=true;
		printIsOn();
	}
	
	
	public void turnOff() {
		isOn=false;
		printIsOn();
	}
	
	
	public void printNumOfLight(){
		System.out.println(numOfLight);
	}
	
	
	public void printIsOn(){
		String status=isOn? "On": "Off";
		System.out.println(status);
	}
	
	public void toggle(Lights ligth) {
		ligth.isOn=!ligth.isOn;
	}
	
	public void toggle() {
		toggle(this);
	}
	
	
	
	
	
	
}
