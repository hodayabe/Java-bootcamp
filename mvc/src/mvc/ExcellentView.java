package mvc;

public class ExcellentView {
	
	public String getId() {
		System.out.println("Enters: id.");
		String str=Runner.scan.nextLine();
		return str;
	}
	
	public String getFirstName() {
		System.out.println("Enters: first name.");
		String str=Runner.scan.nextLine();
		return str;
	}
	public String getLastName() {
		System.out.println("Enters:last name.");
		String str=Runner.scan.nextLine();
		return str;
	}
	
	
	public double getFirstdGrade() {	
		System.out.println("Enter grade 1");
		return Runner.scan.nextInt();
	}

	public double getSecondGrade() {		
		System.out.println("Enter grade 2");
		return Runner.scan.nextInt();
	}
	
	public double getThirdGrade() {		
		System.out.println("Enter grade 3");
		return Runner.scan.nextInt();
	}
	

	public void showAnswer(String answer) {
		System.out.println("the student is: "+answer);
	}

}
