import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class PastrySerialization {

	// 1
	public static void pastryToJsonfile() {

		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		ingredients.add(new Ingredient("sugar", 200));
		ingredients.add(new Ingredient("flour", 500));

		Pastry pastry = new Pastry("pizza", 2000, PastryLabel.DAIRY, ingredients);
		Gson gson = new Gson();
		String userJson = gson.toJson(pastry);
		System.out.println(userJson);
		File file = new File("myFile/pastry.json");
		try (FileWriter writer = new FileWriter(file)) {
			writer.write(userJson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 3
	public static void listOfPastryToJsonfile() {

		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		ingredients.add(new Ingredient("sugar", 200));
		ingredients.add(new Ingredient("flour", 500));

		List<Pastry> pastryList = new ArrayList<Pastry>();
		pastryList.add(new Pastry("pizza", 2000, PastryLabel.DAIRY, ingredients));
		pastryList.add(new Pastry("bread", 2000, PastryLabel.DAIRY, ingredients));

		Gson gson = new Gson();
		String pastryListJson = gson.toJson(pastryList);
		System.out.println(pastryListJson);

		File listFile = new File("myFile/pastryList.json");
		try (FileWriter listWriter = new FileWriter(listFile)) {
			listWriter.write(pastryListJson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
