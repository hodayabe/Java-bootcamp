package command;

public abstract class Command {
	public HeaterApp heater;
  
    Command(HeaterApp heater) {
        this.heater = heater;
    }

    public abstract boolean execute();

	

}
