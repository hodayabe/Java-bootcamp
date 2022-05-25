package streemExercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	
	
	public static void main(String[] args) {
		List<GameCharacter> characters = Arrays.asList(
		new GameCharacter("Arthas Menethil", "Lich King", "Icecrown", 80, 1500,
		Continent.Northrend),
		new GameCharacter("Thrall", "Warchief", "Orgrimmar", 90, 1200, Continent.Kalimdor),
		new GameCharacter("Jaina Proudmoore", "Lord Admiral", "Kul Tiras", 120, 1000,
		Continent.Eastern_Kingdoms),
		new GameCharacter("Tyrande Whisperwind", "Priestess of Elune", "Teldrassil", 120,
		1100,
		Continent.Kalimdor),
		new GameCharacter("Sylvanas Windrunner", "Dark Ranger", "Undercity", 120, 1100,
		Continent.Eastern_Kingdoms));
		
		
		//Create a list with the names of all the game characters from the continent of Kalimdor
		System.out.println("\r---------------list with the names of all the game---------\r");
		
		List<String> names = characters.stream().map(p -> p.getName()).collect(Collectors.toList());
		names.forEach( p -> System.out.println(p + ", "));
		
		
		// Print all characters, sorted by their hit points
		
		System.out.println("\r---------------characters - sorted by hit points---------\r");
		characters.sort((p1,p2)->{
			if(p1.getHitPoints() == p2.getHitPoints())
				return 0;
			if(p1.getHitPoints() < p2.getHitPoints())
				return 1;
			return -1;
		});
		
		characters.forEach( p -> System.out.println(p + ", "));
		
		
		//Find the average hit points of characters in level 120 only.
		System.out.println("\r---------------average hit points of characters in level 120---------\r");
		
		List<Double> hitPoints=characters.stream().filter(p -> p.getLevel() == 120).map(p-> p.getHitPoints())
				.collect(Collectors.toList());
		double average = hitPoints.stream().reduce(0.0, (acc, next) -> (acc + next))/hitPoints.size();
				
				
				
				
				
				
				
				
				
		
		
		
		}

	
	
}
