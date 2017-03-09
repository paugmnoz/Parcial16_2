import java.util.Comparator;

public class ComPeso implements Comparator<User> {

	@Override
	public int compare(User a, User b) {
	
	if(a instanceof User && b instanceof User){
		User tempA = (User)  a;
		User tempB = (User)  b;
		return tempA.getPeso() - tempB.getPeso();
	}
	return -1;
}
}
