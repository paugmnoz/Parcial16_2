import processing.core.PApplet;

public class User implements Comparable <User>{

	private PApplet app;
	private String nombre, apellido;
	private int r, g, b, cedula, edad, peso,y;
	private int color;

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
		color = r +g +b;
	}
	
	public int compareTo(User arg) {
		return nombre.compareTo(arg.getNombre());
	}
	
	@Override
	public int hashCode() {
		return color;
	}
	public boolean equals(Object obj){
	if (obj instanceof User) {
		User u = (User) obj;
		return color == u.getColor();
	}
	return false;
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
	
	public int getColor() {
		return color;
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
