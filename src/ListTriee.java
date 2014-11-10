import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class ListTriee{// implements Comparator{

	public static void main(String[] args) {
		Collection<String> cl = new HashSet<String>();
		
		cl.add("premier");
		cl.add("deuxième");
		cl.add("troixième");
		
		cl = new TreeSet(cl);
		
		System.out.println(cl);
		
		System.out.println("Affichage avec comparator");

	}
	public interface Comparator<T> {
		
		int compare(T a, T b);
	}

}
