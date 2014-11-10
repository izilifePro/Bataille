package testListes;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;


public class test {

	public static void main(String[] args) {
		List<Personne> pers = new LinkedList<Personne>();
		
		SortedSet<Personne> pers1 = new TreeSet<Personne>();
		
		
		
		Personne p1 = new Personne("toto", "pathe", "28/03/1990");
		Personne p2 = new Personne("toto1", "pathe1", "28/03/1991");
		Personne p3 = new Personne("toto2", "pathe2", "28/03/1992");
		
		pers.add(p1);
		pers.add(p2);
		pers.add(p3);
		
		for(Personne p : pers){
			System.out.println(p +" ");
		}

	}

}
