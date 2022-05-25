package mvc;

import java.util.Scanner;

public class Runner {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		ExcellentModel model = new ExcellentModel();
		ExcellentView view = new ExcellentView();
		ExcellentController controller = new ExcellentController(model, view);
		controller.startApp();
	}

}
