package command;

import java.time.LocalTime;

public class OnCommand extends Command {

	private int time;
	
	OnCommand(HeaterApp heater,int time) {
		super(heater);
		this.time=time;
	}

	@Override
	public boolean execute() {
		System.out.println(this);
		return true;
	}

	@Override
	public String toString() {
		return "Heater turned on for "+ time + " minutes on "+LocalTime.now();
	}
	
	
	

}
