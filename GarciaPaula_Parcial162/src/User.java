import processing.core.PApplet;

public class User implements Comparable <User>{

	private PApplet app;
	private String nombre, apellido;
	private int r, g, b, cedula, edad, peso,y;

	public User(PApplet app, String nombre, String apellido, int r, int g, int b, int cedula, int edad, int peso) {
		this.app = app;
		this.nombre = nombre;
		this.apellido = apellido;
		this.r = r;
		this.g = g;
		this.b = b;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
	}

	public void pintar(int y) {
		this.y = y;
		app.fill(r, g, b);
		app.text(nombre + " " + apellido + " " + cedula + " " + edad + " " + peso, 50, y);
	}
	
	public int compareTo(User arg) {
		return nombre.compareTo(arg.getNombre());
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCedula() {
		return cedula;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getR() {
		return r;
	}
	
	public int getB() {
		return b;
	}
	
	public int getG() {
		return g;
	}
}
