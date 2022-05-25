package bootcamp.oop.exercise;


import java.io.IOException;
import java.time.LocalTime;
import java.util.Calendar;

public class Television extends HomeAppliance implements Flatable, Smartable{
	protected float size;
	protected String model;
	protected RemoteControl remoteControl;

	
	//constructors
	
	public Television(String manufacturer , int purchaseYear,int powerConsumption, float size,String transmitMethod){
		super(manufacturer, purchaseYear,powerConsumption);
		setSize(size);
		setModel("A12");
		remoteControl=new RemoteControl(transmitMethod);
	}
	
	
	public int getConsumption(int hours) {
		return hours*getPowerConsumption();
	}

	public Television(float size) {
		this("Generic", (Calendar.getInstance()).get(Calendar.YEAR),600, size, "RF");
	}
	
	public Television() {
		this(40);
	}
	
	
	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		if (size < 2.5f || size > 120f)
			size = 10f;
		this.size = size;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		
		if (model.length()<3) {
			System.out.println("Exception in setModel");
			return;
		}
			
		char ch = model.charAt(0);
		if(!Character.isLetter(ch))
			model = "A"+model;
		
		char ch1 = model.charAt(1);
		char ch2 = model.charAt(2);
		if(!Character.isDigit(ch1) || !Character.isDigit(ch2)) {
			model = ch+"00";
		}
		
		model = model.substring(0, 3);
		this.model = model;
	}


	@Override
	public String toString() {
		return "Television [size=" + size + ", model=" + model + ", remoteControl=" + remoteControl + ", toString()="
				+ super.toString() + "]";
	}


	public float sizeInCM() {
		return size*2.54f;
	}
	
	
	public int isBigger(Television other) {
		float diff = this.size-other.size;
		if(diff>0)
			return 1;
		else if(diff<0)
			return -1;
		else
			return 0;
	}
	
	public LocalTime turnOn() {
		return super.turnOn();
	}


	@Override
	public Appendable append(CharSequence csq) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Appendable append(CharSequence csq, int start, int end) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Appendable append(char c) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isSmart() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isFlat() {
		// TODO Auto-generated method stub
		return false;
	}


	
	
	}