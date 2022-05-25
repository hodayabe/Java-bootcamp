package xmlExercise;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Runner {




	public static void main(String[] args) {
		
		List<Car> carsList= new ArrayList<Car>();
		carsList.add(new Car("sugar", "a", "2020", new LicencePlate("blue")));
		carsList.add(new Car("Lamborigini", "b", "2021", new LicencePlate("pink")));

		
		File outputFile =Create.savesCarsListToXmlFile(carsList);
		
		List<Car> cars = Create.parsesFileReturnList(outputFile);
		
		
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
	}


	
}
