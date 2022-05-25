package mvc;

public class ExcellentModel {

	String answer;


	public void average(double great1, double great2,double great3) {
		double average=(great1+great2+great3)/3;
		answer=average>=90?"excellent student":"great student";
	}


	public String getAnswer() {
		return answer;
	}





}
