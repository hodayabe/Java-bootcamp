package bootcamp.oop.flight;

public class FrequentFlyer {
	
	protected final int FF_NUM;
	protected String firstName;
	protected String lastName;
	protected static int idCount = 0;
	protected MilesCredit credit;
	
	public FrequentFlyer(String firstName, String lastName,MilesCredit credit) {
		FF_NUM = idCount++;
		setFirstName(firstName);
		setLastName(lastName);
		this.credit=credit;
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}