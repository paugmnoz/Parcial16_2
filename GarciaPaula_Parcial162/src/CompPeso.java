import java.util.Comparator;

public class CompPeso implements Comparator <User>{

	@Override
	public int compare(User a, User b) {
		return (a.getPeso() - b.getPeso());

	}

}
