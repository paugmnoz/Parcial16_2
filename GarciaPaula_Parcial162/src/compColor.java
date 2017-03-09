import java.util.Comparator;

public class compColor implements Comparator<User> {

	@Override
	public int compare(User a, User b) {
		return (a.getColor() - b.getColor());
	}
}
