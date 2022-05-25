package bootcamp.oop.exercise;

public class RemoteControl {
	//fields
	private String transmitMethod;
	
	//constructors
	
	public RemoteControl(String transmitMethod) {
		this.setTransmitMethod(transmitMethod);
	}

	public String getTransmitMethod() {
		return transmitMethod;
	}

	private void setTransmitMethod(String transmitMethod) {
		if(transmitMethod=="RF" ||transmitMethod=="IR")
			this.transmitMethod = transmitMethod;
		else
			System.out.println("erorr");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
