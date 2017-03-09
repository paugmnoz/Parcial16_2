import processing.core.PApplet;

public class User {

	private PApplet app;
	private String nombre, apellido;
	private int r, g, b, cedula, edad, peso;
	
	public User(PApplet app, String nombre, String apellido, int r, int g, int b, int cedula, int edad, int peso) {
		this.app = app;
		this.nombre = nombre;
		this.apellido = apellido;
		this.r = r;
		this.g = g;
		this.b = b;
		this.cedula = cedula;
		this.edad =  edad;
		this.peso = peso;
	}

	public void pintar(int y) {
		app.fill(r,g,b);
		app.text(nombre, 50, y);
		app.text(apellido, 110, y);
		app.text(cedula, 180, y);
		app.text(edad, 270, y);
		app.text(peso, 300, y);
		
	}
}
