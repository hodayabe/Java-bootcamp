package bootcamp.oop.lights;

public class Runner {

	public static void main(String[] args) {
		Lights light1 = new Lights();
		Lights light2 = new Lights(2,true);
		
		light1.printIsOn();
		light1.printNumOfLight();
		
		light2.printIsOn();
		light2.printNumOfLight();
		
		light1.turnOff();
		light2.setNumOfLight(10);
		
		light1.printIsOn();
		light1.printNumOfLight();
		
		light2.printIsOn();
		light2.printNumOfLight();
		
		light1.turnOn();
		light2.turnOn();
		light1.turnOff();
		light2.turnOff();
		
		
		light1.toggle(light2);
		light1.toggle();
		
		
	}

}
