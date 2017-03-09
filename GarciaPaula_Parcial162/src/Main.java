import processing.core.PApplet;

public class Main extends PApplet {

	private Logica app;

	public static void main(String[] args) {
		PApplet.main("Main");
	}

	@Override
	public void settings() {
		size(600, 600);
	}

	@Override
	public void setup() {
		app = new Logica(this);
	}

	@Override
	public void draw() {
		background(25);
		app.display();
	}

	@Override
	public void keyReleased() {
		app.tecla();
	}

}
