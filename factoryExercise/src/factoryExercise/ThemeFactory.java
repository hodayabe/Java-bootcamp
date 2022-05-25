package factoryExercise;

public abstract class ThemeFactory {
	
	public abstract Text createText();
	
	public void render() {
		Text text=createText();
		text.render();
	}
	

}
