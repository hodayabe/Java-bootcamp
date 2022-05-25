package factoryExercise;

import java.util.Scanner;

public class runner {
	
	private static ThemeFactory theme;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter 1 for dark 2 for bright");
		int num = Integer.parseInt(scan.next());
		if (num == 1) 
			theme = new DarkThemeFactory();
		 
		else 
			theme = new BrightThemeFactory();
		

		theme.render();
	}

}
