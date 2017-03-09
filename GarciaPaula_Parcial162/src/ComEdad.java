import java.util.Comparator;

public class ComEdad implements Comparator<User> {

	@Override
	public int compare(User a, User b) {
		return (a.getEdad() - b.getEdad())*-1;
	}
}
