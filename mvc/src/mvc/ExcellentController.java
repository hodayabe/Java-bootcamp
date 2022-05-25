package mvc;

public class ExcellentController {

	private ExcellentModel model;
	private ExcellentView view;
	
	
	public ExcellentController(ExcellentModel model, ExcellentView view) {
		this.model= model;
		this.view = view;
	}
	

	public void startApp() {
		String id = view.getId();
		String firstName = view.getFirstName();
		String lastName = view.getLastName();
		double grade1=view.getFirstdGrade();
		double grade2=view.getSecondGrade();
		double grade3=view.getThirdGrade();
		
		
		model.average(grade1, grade2, grade3);
		
		String answer = model.getAnswer();
		
		view.showAnswer(answer);
	}

	



}
