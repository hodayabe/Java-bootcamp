package bootcamp.oop.exercise;

import java.time.LocalTime;

public interface Appliable {

	public abstract LocalTime turnOn();
	public abstract long turnOffSec(LocalTime on);
	
}
