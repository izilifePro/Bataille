package comparable;
import java.util.TreeSet;
import java.util.SortedSet;

public class Test {

	public static void main(String[] args) {
		SortedSet<ComparableMarin> set =  new TreeSet<ComparableMarin>() ;
		
		ComparableMarin m1 =  new ComparableMarin("Surcouf",  "Alain") ;
		ComparableMarin m2 =  new ComparableMarin("Tabarly",  "Eric") ;
		ComparableMarin m3 =  new ComparableMarin("Auguin",  "Christophe") ;
		ComparableMarin m4 =  new ComparableMarin("Surcouf",  "Robert") ;

		set.add(m1) ;
		set.add(m2) ;
		set.add(m3) ;
		set.add(m3) ;
		set.add(m4) ;

		 for (ComparableMarin m : set) {
		   System.out.println(m) ;
		}

	}

}
