package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;


public class JsonFileToApartmentObject {
	
	public static void run() {
		File file = new File(Path.of("myFiles", "apartment.json").toString());
		try (FileReader fileReader = new FileReader(file)){
			
			Gson gson = new Gson();
			JsonReader jsonReader = new JsonReader(fileReader);
			
			Type apartmentListType = new TypeToken<ArrayList<Apartment>>(){}.getType();
			List<Apartment> apartmentList = gson.fromJson(jsonReader,apartmentListType);

			apartmentList.forEach(System.out::println);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
//	public static void jsonFileToListOfPastry() {
//		File file = new File(Path.of("myFile", "pastryList.json").toString());
//		try (FileReader fileReader = new FileReader(file)){
//		
//			Gson gson = new Gson();
//			JsonReader jsonReader = new JsonReader(fileReader);
//			
//			Type pastryListType = new TypeToken<ArrayList<Pastry>>(){}.getType();
//			List<Pastry> pastryList = gson.fromJson(jsonReader,pastryListType);
//			System.out.println("==========================");
//			pastryList.forEach(System.out::println);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	
}
