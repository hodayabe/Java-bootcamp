package command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CommandHistory {

	private List<Command> history=new ArrayList<>();


	public void add(Command c) {
		history.add(c);
	}

	public List<Command> getHistory() {
		return history;
	}



}

