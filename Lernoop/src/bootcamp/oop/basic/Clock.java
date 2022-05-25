package bootcamp.oop.basic;

public class Clock {
//fields
	int timeInMin;
	
	//constractor
	public Clock(int time) {
		timeInMin=time;
	}
	
	//method
	public void printTime(){
		int hours=timeInMin/60;
		int minutes=timeInMin%60;
		System.out.printf("%02d:%02d",hours,minutes);
	}
}
