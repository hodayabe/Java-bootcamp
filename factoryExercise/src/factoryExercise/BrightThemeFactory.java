package factoryExercise;


public class BrightThemeFactory extends ThemeFactory{

	@Override
	public Text createText() {
		return new DarkText();
	}

	
}
