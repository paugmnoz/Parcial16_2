import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private String[] usuario;
	private String[] info;
	private String[] tono;
	private String nombre, apellido;
	private int cedula, edad, r, g, b, peso;

	private int pintar, tecla;

	private ArrayList<User> user = new ArrayList<User>();
	private ArrayList<User> userBu = new ArrayList<User>();

	private TreeSet<User> userT = new TreeSet<User>(new ComEdad());
	private HashSet<User> userH =  new HashSet<User>();
	
	public Logica(PApplet app) {
		this.app = app;
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

		switch (pintar) {

		case 0:
			for (int i = 0; i < user.size(); i++) {
				user.get(i).pintar(30 + 30 * i);
			}
			break;

		case 1: // ORDEN NATURAL
			Collections.sort(user);
			for (int i = 0; i < user.size(); i++) {
				user.get(i).pintar(30 + 30 * i);
			}
			break;

		case 2: //
			Collections.sort(user, new CompPeso());
			for (int i = 0; i < user.size(); i++) {
				user.get(i).pintar(30 + 30 * i);
			}

			break;

		case 3: //
			Iterator<User> it = userT.iterator();
			int j = 0;
			while (it.hasNext()) {
				User user = (User) it.next();
				user.pintar(30 + 30 * j);
				j++;
			}

			break;

		case 4: //
			Collections.shuffle(user);
			int k=0;
			for (User user : userH) {
				k++;
				user.pintar(30 + 30*k);
			}
			break;

		}
	}

	public void tecla() {
		
		if (app.key == '1') {
			user.clear();
			userT.clear();
			userH.clear();
			user.addAll(userBu);
			pintar = 1;
		} 
		
		else if (app.key == '2') {
			user.clear();
			userT.clear();
			userH.clear();
			user.addAll(userBu);
			pintar = 2;
		} 
		
		else if (app.key == '3') {
			user.clear();
			userT.clear();
			userH.clear();
			userT.addAll(userBu);
			pintar = 3;
		}
		
		 else if (app.key == '4') {
				user.clear();
				userT.clear();
				userH.clear();
				userH.addAll(userBu);
				pintar = 4;
			}
	}

}
