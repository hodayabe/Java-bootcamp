package factoryExercise;

public class DarkThemeFactory extends ThemeFactory{

	@Override
	public Text createText( ) {
		return new BrightText();
	}
	
	

	
	
	
	
}
