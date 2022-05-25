import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;


public class PastryDeserialization {
	
	
	//2
	public static void jsonFileToPastry() {
		File file = new File(Path.of("myFile", "pastry.json").toString());
		try (FileReader fileReader = new FileReader(file)) {

			JsonReader jsonReader = new JsonReader(fileReader);

			Gson gson = new Gson();
			Pastry pastry = gson.fromJson(jsonReader, Pastry.class);
			System.out.println(pastry);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//4
	public static void jsonFileToListOfPastry() {
		File file = new File(Path.of("myFile", "pastryList.json").toString());
		try (FileReader fileReader = new FileReader(file)){
		
			Gson gson = new Gson();
			JsonReader jsonReader = new JsonReader(fileReader);
			
			Type pastryListType = new TypeToken<ArrayList<Pastry>>(){}.getType();
			List<Pastry> pastryList = gson.fromJson(jsonReader,pastryListType);
			System.out.println("==========================");
			pastryList.forEach(System.out::println);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

	
	
	

}
