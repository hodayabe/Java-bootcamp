package command;

import java.time.LocalTime;

public class OffCommand extends Command {

	OffCommand(HeaterApp heater) {
		super(heater);
	}

	@Override
	public boolean execute() {
		System.out.println(this);
		return true;
	}

	@Override
	public String toString() {
		return "Heater turned off on "+LocalTime.now();
	}

	
	
}
