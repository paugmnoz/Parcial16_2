import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private String[] usuario;
	private String[] info;
	private String[] tono;
	private String nombre, apellido;
	private int cedula, edad, r, g, b, peso;

	private ArrayList<User> user = new ArrayList<User>();
	private ArrayList<User> userBu = new ArrayList<User>();

	public Logica(PApplet app) {

		usuario = app.loadStrings("../data/usuarios"); // cargo el txt
		info = app.loadStrings("../data/informacion");
		tono = app.loadStrings("../data/tonos");

		for (int i = 0; i < usuario.length; i++) {

			String[] userTemp = usuario[i].split(":");
			nombre = userTemp[0];
			apellido = userTemp[1];

			String[] infoTemp = info[i].split("/");
			cedula = Integer.parseInt(infoTemp[0]);
			edad = Integer.parseInt(infoTemp[1]);
			peso = Integer.parseInt(infoTemp[2]);

			String[] tonoTemp = tono[i].split("/");
			r = Integer.parseInt(tonoTemp[0]);
			g = Integer.parseInt(tonoTemp[1]);
			b = Integer.parseInt(tonoTemp[2]);

			user.add(new User(app, nombre, apellido, r, g, b, cedula, edad, peso));
		}

		userBu.addAll(user);
	}

	public void display() {
		for (int i = 0; i < user.size(); i++) {
			user.get(i).pintar(30 + 30 * i);
		}
	}

	public void key() {
		
	}
}
