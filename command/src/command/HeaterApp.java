package command;

import java.util.Iterator;

public class HeaterApp {
	
	private CommandHistory history = new CommandHistory();
	
	public void TurnOn(int i) {
		int time = i>90 ? 90 : i;
		executeCommand(new OnCommand(this,time));
	}

	public void TurnOff() {
		executeCommand(new OffCommand(this));
		
	}

	public void showHistory() {
		Iterator<Command> iterator=history.getHistory().iterator();
		int i =0;
		while(iterator.hasNext()&&i<5) {
		System.out.println(iterator.next());
		i++;
		}
	}
	
	private void executeCommand(Command command) {
        if (command.execute()) {
            history.add(command);
        }
    }


}
